package com.crawler.example.web;

import com.crawler.example.dirver.BaiDuHotProcess;
import com.crawler.example.entity.BaiduHot;
import com.crawler.example.map.BaiduHotMap;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BaiduHotDownChorme {

    @Autowired

    BaiduHotMap baiduHotMap;
    @Scheduled(cron = "0/20 * * * * ? ")
    public void downBaiDuHot(){
        ArrayList<String> command = new ArrayList<String>();
        //不显示google 浏览器
        command.add("--headless");
        Launcher launcher = new Launcher();
        try (SessionFactory factory = launcher.launch(command);
             Session session = factory.create()){
            session.navigate("https://gupiao.baidu.com/concept/");
            session.waitDocumentReady();
            String content = (String) session.getContent();
            //System.out.println(content);
            Document doc = Jsoup.parse(content);
            ArrayList<BaiduHot> abh = new BaiDuHotProcess().processBaiduHot(doc);
            for(BaiduHot b:abh){
                baiduHotMap.InsertBaiduHot(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

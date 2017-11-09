package com.crawler.example.dirver;

import com.crawler.example.entity.BaiduHot;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class BaiDuHotProcess {

    public ArrayList<BaiduHot> processBaiduHot(Document doc){

        ArrayList<BaiduHot> abh = new ArrayList<BaiduHot>();
        //提取数据
        Elements divsBig = doc.getElementsByClass("hot-concept clearfix");
        for(int i=0;i<divsBig.size();i++){
            BaiduHot baiduHot = new BaiduHot();
            //获得行业数据
            Elements cloumn1 = divsBig.get(i).getElementsByClass("concept-header column1");
            //获取行数数据
            baiduHot.title_line1 = cloumn1.get(0).getElementsByClass("text-ellipsis").get(0).ownText();
            //获取热搜指数
            baiduHot.title_line2 =Integer.parseInt( cloumn1.get(0).getElementsByTag("h3").get(0).getElementsByTag("span").get(0).ownText());
            //获得发布时间
            baiduHot.title_line3 = cloumn1.get(0).getElementsByTag("p").get(0).ownText();
            //获得简要内容
            baiduHot.title_line4 = cloumn1.get(0).getElementsByTag("p").get(1).ownText();
            //概述内容
            baiduHot.dirver_thing = divsBig.get(i).getElementsByClass("concept-event column3").get(0).ownText();
            //获得推荐股价
            Elements stockUl = divsBig.get(i).getElementsByClass("no-click");
            //System.out.println(stockUl.get(0).getElementsByTag("a").get(0).getElementsByTag("div").size());
            //股票1名称
            baiduHot.hot_stock_name_1 = stockUl.get(0).getElementsByTag("a").get(0).getElementsByTag("div").get(0).ownText();
            //股票1代码
            baiduHot.hot_stock_code_1 = stockUl.get(0).getElementsByTag("a").get(0).getElementsByTag("div").get(1).ownText();
            //股票1价格
            baiduHot.hot_stock_price_1 = Double.parseDouble(stockUl.get(0).getElementsByClass("column2").get(1).ownText());
            //股票1涨幅

            baiduHot.hot_stock_increment_1 = stockUl.get(0).child(2).ownText();

            //股票2名称
            baiduHot.hot_stock_name_2 = stockUl.get(1).getElementsByTag("a").get(0).getElementsByTag("div").get(0).ownText();
            //股票2代码
            baiduHot.hot_stock_code_2 = stockUl.get(1).getElementsByTag("a").get(0).getElementsByTag("div").get(1).ownText();
            //股票2价格
            baiduHot.hot_stock_price_2 = Double.parseDouble(stockUl.get(1).getElementsByClass("column2").get(1).ownText());
            //股票2涨幅
            baiduHot.hot_stock_increment_2 = stockUl.get(1).child(2).ownText();

            //股票3名称
            baiduHot.hot_stock_name_3 = stockUl.get(2).getElementsByTag("a").get(0).getElementsByTag("div").get(0).ownText();
            //股票3代码
            baiduHot.hot_stock_code_3 = stockUl.get(2).getElementsByTag("a").get(0).getElementsByTag("div").get(1).ownText();
            //股票3价格
            baiduHot.hot_stock_price_3 = Double.parseDouble(stockUl.get(2).getElementsByClass("column2").get(1).ownText());
            //股票3涨幅
            baiduHot.hot_stock_increment_3 = stockUl.get(2).child(2).ownText();

            abh.add(baiduHot);
        }
        return  abh;
    }
}

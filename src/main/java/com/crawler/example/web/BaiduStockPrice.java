package com.crawler.example.web;

        import com.crawler.example.dirver.GetJson;
        import com.crawler.example.entity.StockPrice;
        import com.crawler.example.map.StockPriceMap;
        import org.json.JSONObject;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.scheduling.annotation.Scheduled;
        import org.springframework.web.bind.annotation.RestController;

//查询股票的价格
@RestController
public class BaiduStockPrice {

    @Autowired
    StockPriceMap stockPriceMap;

    //下载股票曲线图
    //@Scheduled(cron = "0/20 * * * * ? ")
    public void downStockPrice(){
        //url 生成
        String url = "https://gupiao.baidu.com/api/stocks/stocktimeline?from=pc&os_ver=1&cuid=xxx&vv=100&format=json&stock_code=sh600358&timestamp=" + System.currentTimeMillis();
        //访问获得json数据
        JSONObject stock = new GetJson().getHttpJson(url,1);
        StockPrice stockPrice = new StockPrice();
        stockPrice.stock_id = "sh60035";
        stockPrice.data = stock.toString();
        //将json数据存入数据库中
        stockPriceMap.insertIntoStock(stockPrice);
    }
}

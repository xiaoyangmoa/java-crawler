package com.crawler.example.map;

import com.crawler.example.entity.StockPrice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockPriceMap {

    @Insert("insert into stock(stock_id,data) values(#{stock_id},#{data})")
    public void insertIntoStock(StockPrice stockPrice);

}

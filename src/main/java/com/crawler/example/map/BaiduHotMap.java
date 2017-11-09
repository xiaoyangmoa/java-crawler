package com.crawler.example.map;

import com.crawler.example.entity.BaiduHot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

//百度接口数据
@Mapper
public interface BaiduHotMap {
    @Insert("insert into baidu_hot(title_line1,title_line2,title_line3,title_line4,dirver_thing,hot_stock_name_1," +
            "hot_stock_code_1,hot_stock_price_1,hot_stock_increment_1,hot_stock_name_2,hot_stock_code_2,hot_stock_price_2," +
            "hot_stock_increment_2,hot_stock_name_3,hot_stock_code_3,hot_stock_price_3,hot_stock_increment_3) values(" +
            "#{title_line1},#{title_line2},#{title_line3},#{title_line4},#{dirver_thing},#{hot_stock_name_1},#{hot_stock_code_1}," +
            "#{hot_stock_price_1},#{hot_stock_increment_1},#{hot_stock_name_2},#{hot_stock_code_2},#{hot_stock_price_2},#{hot_stock_increment_2}," +
            "#{hot_stock_name_3},#{hot_stock_code_3},#{hot_stock_price_3},#{hot_stock_increment_3})")
    public void InsertBaiduHot(BaiduHot baiduHot);
}

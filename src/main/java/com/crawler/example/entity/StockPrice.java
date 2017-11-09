package com.crawler.example.entity;

import org.json.JSONObject;

public class StockPrice {

    public  String stock_id;

    public String data;

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

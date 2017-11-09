package com.crawler.example.entity;

public class BaiduHot implements Cloneable {

    public int id;

    public String title_line1;

    public int title_line2;

    public String title_line3;

    public String title_line4;

    public String dirver_thing;

    public String hot_stock_name_1;

    public String hot_stock_code_1;

    public double hot_stock_price_1;

    public String hot_stock_increment_1;

    public String hot_stock_name_2;

    public String hot_stock_code_2;

    public double hot_stock_price_2;

    public String hot_stock_increment_2;

    public String hot_stock_name_3;

    public String hot_stock_code_3;

    public double hot_stock_price_3;

    public String hot_stock_increment_3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle_line1() {
        return title_line1;
    }

    public void setTitle_line1(String title_line1) {
        this.title_line1 = title_line1;
    }

    public int getTitle_line2() {
        return title_line2;
    }

    public void setTitle_line2(int title_line2) {
        this.title_line2 = title_line2;
    }

    public String getTitle_line3() {
        return title_line3;
    }

    public void setTitle_line3(String title_line3) {
        this.title_line3 = title_line3;
    }

    public String getTitle_line4() {
        return title_line4;
    }

    public void setTitle_line4(String title_line4) {
        this.title_line4 = title_line4;
    }

    public String getDirver_thing() {
        return dirver_thing;
    }

    public void setDirver_thing(String dirver_thing) {
        this.dirver_thing = dirver_thing;
    }

    public String getHot_stock_name_1() {
        return hot_stock_name_1;
    }

    public void setHot_stock_name_1(String hot_stock_name_1) {
        this.hot_stock_name_1 = hot_stock_name_1;
    }

    public String getHot_stock_code_1() {
        return hot_stock_code_1;
    }

    public void setHot_stock_code_1(String hot_stock_code_1) {
        this.hot_stock_code_1 = hot_stock_code_1;
    }

    public double getHot_stock_price_1() {
        return hot_stock_price_1;
    }

    public void setHot_stock_price_1(double hot_stock_price_1) {
        this.hot_stock_price_1 = hot_stock_price_1;
    }

    public String getHot_stock_increment_1() {
        return hot_stock_increment_1;
    }

    public void setHot_stock_increment_1(String hot_stock_increment_1) {
        this.hot_stock_increment_1 = hot_stock_increment_1;
    }

    public String getHot_stock_name_2() {
        return hot_stock_name_2;
    }

    public void setHot_stock_name_2(String hot_stock_name_2) {
        this.hot_stock_name_2 = hot_stock_name_2;
    }

    public String getHot_stock_code_2() {
        return hot_stock_code_2;
    }

    public void setHot_stock_code_2(String hot_stock_code_2) {
        this.hot_stock_code_2 = hot_stock_code_2;
    }

    public double getHot_stock_price_2() {
        return hot_stock_price_2;
    }

    public void setHot_stock_price_2(double hot_stock_price_2) {
        this.hot_stock_price_2 = hot_stock_price_2;
    }

    public String getHot_stock_increment_2() {
        return hot_stock_increment_2;
    }

    public void setHot_stock_increment_2(String hot_stock_increment_2) {
        this.hot_stock_increment_2 = hot_stock_increment_2;
    }

    public String getHot_stock_name_3() {
        return hot_stock_name_3;
    }

    public void setHot_stock_name_3(String hot_stock_name_3) {
        this.hot_stock_name_3 = hot_stock_name_3;
    }

    public String getHot_stock_code_3() {
        return hot_stock_code_3;
    }

    public void setHot_stock_code_3(String hot_stock_code_3) {
        this.hot_stock_code_3 = hot_stock_code_3;
    }

    public double getHot_stock_price_3() {
        return hot_stock_price_3;
    }

    public void setHot_stock_price_3(double hot_stock_price_3) {
        this.hot_stock_price_3 = hot_stock_price_3;
    }

    public String getHot_stock_increment_3() {
        return hot_stock_increment_3;
    }

    public void setHot_stock_increment_3(String hot_stock_increment_3) {
        this.hot_stock_increment_3 = hot_stock_increment_3;
    }

    @Override
    public String toString() {
        return "BaiduHot{" +
                "id=" + id +
                ", title_line1='" + title_line1 + '\'' +
                ", title_line2='" + title_line2 + '\'' +
                ", title_line3='" + title_line3 + '\'' +
                ", title_line4='" + title_line4 + '\'' +
                ", dirver_thing='" + dirver_thing + '\'' +
                ", hot_stock_name_1='" + hot_stock_name_1 + '\'' +
                ", hot_stock_code_1=" + hot_stock_code_1 +
                ", hot_stock_price_1=" + hot_stock_price_1 +
                ", hot_stock_increment_1=" + hot_stock_increment_1 +
                ", hot_stock_name_2='" + hot_stock_name_2 + '\'' +
                ", hot_stock_code_2=" + hot_stock_code_2 +
                ", hot_stock_price_2=" + hot_stock_price_2 +
                ", hot_stock_increment_2=" + hot_stock_increment_2 +
                ", hot_stock_name_3='" + hot_stock_name_3 + '\'' +
                ", hot_stock_code_3=" + hot_stock_code_3 +
                ", hot_stock_price_3=" + hot_stock_price_3 +
                ", hot_stock_increment_3=" + hot_stock_increment_3 +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

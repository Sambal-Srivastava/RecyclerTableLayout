package com.apps.recyclertablelayout;

public class Model_Item {

    String title1, des1, title2, des2;

    public Model_Item() {
    }

    public Model_Item(String title1, String des1, String title2, String des2) {
        this.title1 = title1;
        this.des1 = des1;
        this.title2 = title2;
        this.des2 = des2;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2;
    }
}

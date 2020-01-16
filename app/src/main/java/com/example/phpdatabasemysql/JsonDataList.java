package com.example.phpdatabasemysql;

public class JsonDataList {

    String user_name;
    String user_img;
    String user_description;

    public JsonDataList(String user_name, String user_img, String user_description) {
        this.user_name = user_name;
        this.user_img = user_img;
        this.user_description = user_description;
    }

    public JsonDataList() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }
}

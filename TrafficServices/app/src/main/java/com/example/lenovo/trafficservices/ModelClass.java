package com.example.lenovo.trafficservices;

/**
 * Created by LENOVO on 11/04/2017.
 */

public class ModelClass {
    String userName,image;

    public ModelClass(String image, String userName) {
        this.image = image;
        this.userName = userName;
    }

    public ModelClass() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}

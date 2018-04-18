package com.example.lenovo.trafficservices;



public class ModelClassCarOwner {
    String userName,image, carNumber, carPrice, carSeats, phoneNumber, time;

    public ModelClassCarOwner(String image, String userName, String carNumber, String carPrice,
                              String carSeats, String phoneNumber, String time) {
        this.image = image;
        this.userName = userName;
        this.carNumber = carNumber;
        this.carPrice = carPrice;
        this.carSeats = carSeats;
        this.phoneNumber = phoneNumber;
        this.time = time;
    }

    public ModelClassCarOwner() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }
    public String getCarPrice() {
        return carPrice;
    }
    public void setCarSeats(String carSeats) {
        this.carSeats = carSeats;
    }
    public String getCarSeats() {
        return carSeats;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void settime(String time) {
        this.time = time;
    }
    public String gettime() {
        return time;
    }


    public String getimage() {
        return image;
    }
    public void setimage(String image) {
        this.image = image;
    }

}

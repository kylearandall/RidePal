package com.example.ridepal;

public class PassengerTestObject {

    private String emailID;
    private String name;
    private String picture;
    private String destName;
    private String originName;

    public PassengerTestObject(String emailID, String name, String picture, String destName, String originName) {
        this.emailID = emailID;
        this.name = name;
        this.picture = picture;
        this.destName = destName;
        this.originName = originName;
    }

    public PassengerTestObject(){

    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }
}

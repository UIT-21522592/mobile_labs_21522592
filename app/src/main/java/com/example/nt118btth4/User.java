package com.example.nt118btth4;

public class User {
    private String userFullName;
    private int phoneNumber;
    private String userName;
    private String userPassword;

    public User(){
        this.userFullName = null;
        this.phoneNumber = 0;
        this.userName = null;
    }
    public void setUserFullName(String in1){ this.userFullName = in1;}
    public String getUserFullName(){return this.userFullName;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void checkValidationUserName(String in){
        if(in.length() >= 6)
    }

}

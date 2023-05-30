package com.example.nt118btth4;

import android.widget.Toast;

public class User {
    private String userFullName;
    private String phoneNumber;
    private String userName;
    private String userPassword;
    public User(){
        this.userFullName = null;
        this.phoneNumber = null;
        this.userName = null;
        this.userPassword = null;
    }
    public void setUserFullName(String in1){ this.userFullName = in1;}
    public String getUserFullName(){return this.userFullName;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserPassword(String userPassword){this.userPassword = userPassword;}

    public String getUserPassword(){return userPassword;}
    public boolean checkValidationUserName(String in){
        if(in.length() >= 6){
            return true;
        }
        return false;
    }

    public boolean checkValidPhoneNumber(String in){
        if(in.length() <= 10){
            for(int i = 0; i<in.length();i++) {
                if(Character.isDigit(in.charAt(i))){
                    continue;
                }else return false;
            }
        }
        return false;
    }

// Quy uoc:
//    -1 la khong ton tai
//    -2 la khong co ky tu dac biet
//    -3 la khong co chu viet hoa
//    -4 la khong co so
    public int checkValidationPassword(String in){
        if(in.isEmpty() == false){
            if(in.length() >= 6){

                boolean flag[] = {false,false,false};
                for(int i=0;i<in.length();i++){
                    if(!Character.isLetterOrDigit(in.charAt(i))) flag[0] = true; // Ham kiem tra xem co ky tu dac biet khong
                    if(Character.isUpperCase(in.charAt(i))) flag[1] = true; // Ham kiem tra xem co ky tu viet hoa
                    if(Character.isDigit(in.charAt(i))) flag[0] = true; // Ham kiem tra xem co so khong
                }
                for(int i=0;i<3;i++){
                    if(flag[i] == false){
                        return 0-i-1;
                    }
                }
            }
        }

        return -1;
    }

}

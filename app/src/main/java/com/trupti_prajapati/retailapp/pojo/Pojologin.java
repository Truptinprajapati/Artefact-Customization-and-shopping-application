package com.trupti_prajapati.retailapp.pojo;

/**
 * Created by Lenovo on 20-03-2017.
 */

public class Pojologin {


    /**
     * status : 1
     * userId : 3
     * message : You are Successfully Logged in
     */

    private int status;
    private int userId;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

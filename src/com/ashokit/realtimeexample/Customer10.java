package com.ashokit.realtimeexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Customer10 {
    private String customerId;
    private String name;
    private String mobNum;
    private String emailId;
    private String city;
    private String cardNum;
    private String dob;
    private String balance;

    public Customer10(String customerId, String name, String mobNum, String emailId,
                      String city, String cardNum, String dob, String balance) {
        this.customerId = customerId;
        this.name = name;
        this.mobNum = mobNum;
        this.emailId = emailId;
        this.city = city;
        this.cardNum = cardNum;
        this.dob = dob;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer10{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", mobNum='" + mobNum + '\'' +
                ", emailId='" + emailId + '\'' +
                ", city='" + city + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", dob='" + dob + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}


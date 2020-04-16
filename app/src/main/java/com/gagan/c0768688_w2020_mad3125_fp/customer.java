package com.gagan.c0768688_w2020_mad3125_fp;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class customer implements Serializable {
    private String customerId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private ArrayList<Bill> bills;
    private Double totalAmountToPay;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
       fullName = firstName + lastName;
        return fullName;
    }

    public void setFullName(String fullName) {
//        fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public Double getTotalAmountToPay() {
        return totalAmountToPay;
    }

    public void setTotalAmountToPay(Double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public customer(String customerId, String firstName, String lastName,  String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.email = email;
        this.bills = bills;
        this.totalAmountToPay = totalAmountToPay;
    }




}

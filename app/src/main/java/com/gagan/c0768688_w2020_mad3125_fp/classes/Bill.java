package com.gagan.c0768688_w2020_mad3125_fp.classes;

import java.io.Serializable;

public abstract class Bill implements IDisplay, Serializable {


     String billId;
     String billDate;
    String billType;
     Double totalBillAmount= 0.0;

    public Bill(String billId, String billDate, String billType, Double totalBillAmount) {
        this.billId = billId;
        this.billDate = billDate;
        this.billType = billType;
        this.totalBillAmount = totalBillAmount;
    }
    public Double billCalculate(){
        double dummyAmount = 0.0;
        return dummyAmount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public  String getBillType() {
        return billType;
    }

    public void setBillType( String billType) {
        this.billType = billType;
    }

    public Double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(Double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }
}



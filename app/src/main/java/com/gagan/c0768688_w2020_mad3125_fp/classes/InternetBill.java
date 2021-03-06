package com.gagan.c0768688_w2020_mad3125_fp.classes;

import java.io.Serializable;

public class InternetBill extends Bill implements Serializable,IDisplay {
    private String providername;
    private int internetGBused;

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public int getInternetGBused() {
        return internetGBused;
    }

    public void setInternetGBused(int internetGBused) {
        this.internetGBused = internetGBused;
    }

    public InternetBill(String billId, String billDate, String billType, Double totalBillAmount, String providername, int internetGBused) {
        super(billId, billDate, billType, totalBillAmount);
        this.providername = providername;
        this.internetGBused = internetGBused;
        this.totalBillAmount = billCalculate();
    }

    @Override
    public Double billCalculate(){
        double totalBillAmount= 0.0;
        if( internetGBused  < 10){
            totalBillAmount = 3 * internetGBused ;
        }
        else {
            totalBillAmount= 3.5 * internetGBused ;
        }
        return totalBillAmount;

    }

    @Override
    public void print() {

    }
}

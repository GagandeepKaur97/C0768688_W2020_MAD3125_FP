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
        double billAmount = 0.0;
        if( internetGBused  < 10){
            billAmount = 3 * internetGBused ;
        }
        else {
            billAmount = 3.5 * internetGBused ;
        }
        return billAmount;

    }

    @Override
    public void print() {

    }
}

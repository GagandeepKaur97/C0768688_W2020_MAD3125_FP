package com.gagan.c0768688_w2020_mad3125_fp.classes;

public class MobileBill extends Bill implements IDisplay {
    private String mobilemanufacturer;
    private String Planname;
    private String mobileNo;
    private int internetGBused;
    private int minutesused;

    public String getMobilemanufacturer() {
        return mobilemanufacturer;
    }

    public void setMobilemanufacturer(String mobilemanufacturer) {
        this.mobilemanufacturer = mobilemanufacturer;
    }

    public String getPlanname() {
        return Planname;
    }

    public void setPlanname(String planname) {
        Planname = planname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getInternetGBused() {
        return internetGBused;
    }

    public void setInternetGBused(int internetGBused) {
        this.internetGBused = internetGBused;
    }

    public int getMinutesused() {
        return minutesused;
    }

    public void setMinutesused(int minutesused) {
        this.minutesused = minutesused;
    }

    public MobileBill(String billId, String billDate, String billType, Double totalBillAmount, String mobilemanufacturer, String planname, String mobileNo, int internetGBused, int minutesused) {
        super(billId, billDate, billType, totalBillAmount);
        this.mobilemanufacturer = mobilemanufacturer;
        Planname = planname;
        this.mobileNo = mobileNo;
        this.internetGBused = internetGBused;
        this.minutesused = minutesused;
        this.totalBillAmount = billCalculate();
    }
    @Override
    public Double billCalculate(){
        double totalBillAmount = 0.0;
        totalBillAmount = (this.internetGBused ) * 25 + (this.minutesused) * 0.2;
        return totalBillAmount;
    }

    @Override
    public void print() {

    }
}

package classes;

import classes.Bill;

public class MobileBill extends Bill {
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
    }
}
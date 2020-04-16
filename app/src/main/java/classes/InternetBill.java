package classes;

import java.io.Serializable;

import classes.Bill;

public class InternetBill extends Bill implements Serializable {
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
    }
}

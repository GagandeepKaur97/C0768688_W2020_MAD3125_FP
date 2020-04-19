package com.gagan.c0768688_w2020_mad3125_fp.classes;

public class HydroBill extends Bill implements IDisplay {
    private String agencyname;
    private int unitsconsumed;

    public String getAgencyname() {
        return agencyname;
    }

    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname;
    }

    public int getUnitsconsumed() {
        return unitsconsumed;
    }

    public void setUnitsconsumed(int unitsconsumed) {
        this.unitsconsumed = unitsconsumed;
    }

    public HydroBill(String billId, String billDate, String billType, Double totalBillAmount, String agencyname, int unitsconsumed) {
        super(billId, billDate, billType, totalBillAmount);
        this.agencyname = agencyname;
        this.unitsconsumed = unitsconsumed;
        this.totalBillAmount = billCalculate();
    }


    @Override
    public Double billCalculate(){
        double totalBillAmount = 0.0;
        if (unitsconsumed < 10)
        {
            totalBillAmount = 1.5 * unitsconsumed;
        }
        else
        {
            totalBillAmount = 2 * unitsconsumed;
        }
        return totalBillAmount;
    }

    @Override
    public void print() {

    }
}


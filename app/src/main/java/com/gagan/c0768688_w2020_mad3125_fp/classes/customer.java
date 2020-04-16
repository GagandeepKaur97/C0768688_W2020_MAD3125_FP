package com.gagan.c0768688_w2020_mad3125_fp.classes;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class customer implements Parcelable {

    private String customerId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String emailId;
    private HashMap<String, Bill> customerBills = new HashMap<String, Bill>();
    private Double allTotal;

    public customer(String customerId, String firstName, String lastName, String emailId) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


    protected customer(Parcel in) {
        customerId = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        emailId = in.readString();
        customerBills = in.readHashMap(Bill.class.getClassLoader());
        allTotal = in.readDouble();
    }

    public static final Creator<customer> CREATOR = new Creator<customer>() {
        @Override
        public customer createFromParcel(Parcel in) {
            return new customer(in);
        }

        @Override
        public customer[] newArray(int size) {
            return new customer[size];
        }
    };

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }




    public void addBill(String billId, Bill bill)
    {
        this.customerBills.put(billId, bill);
    }

    public HashMap<String, Bill> getCustomerBills() {
        return customerBills;
    }

    public void setCustomerBills(HashMap<String, Bill> customerBills) {
        this.customerBills = customerBills;
    }


    public ArrayList<Bill> getBills()
    {
        Collection<Bill> demoValues = customerBills.values();
        ArrayList<Bill> billsList = new ArrayList<>(demoValues);
        return billsList;
    }
    public Double getAllTotal() {
        return allTotal;
    }

    public void setAllTotal(Double allTotal) {
        this.allTotal = allTotal;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(customerId);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(emailId);
        dest.writeMap(customerBills);
        if (allTotal == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(allTotal);
        }

    }

    public String getFullName() {
        fullName = firstName+" "+lastName;
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getTotalAmount()
    {
        double allTotal2 = 0.0d;
        for (Bill b : customerBills.values())
        {
            allTotal2 += b.getTotalBillAmount();
        }
        return allTotal2;
    }

}

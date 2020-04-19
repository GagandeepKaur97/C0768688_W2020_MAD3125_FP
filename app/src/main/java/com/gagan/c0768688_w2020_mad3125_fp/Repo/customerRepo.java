package com.gagan.c0768688_w2020_mad3125_fp.Repo;

import com.gagan.c0768688_w2020_mad3125_fp.classes.HydroBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.InternetBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.MobileBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class customerRepo {
    private static customerRepo dataStorage = new customerRepo();
    private ArrayList<com.gagan.c0768688_w2020_mad3125_fp.classes.customer> customers = new ArrayList<>();

    public customerRepo() {

        loadDetails();
    }

    public static customerRepo getInstance() {
        return dataStorage;
    }

    public ArrayList<customer> getCustomers() {
        return this.customers;
    }

    public void loadDetails() {
        MobileBill M1   = new  MobileBill("MOB001","28/07/1995","MOBILE",500.5,"iphone", "0989789687","wakeup",15,24);
        InternetBill I1 = new InternetBill("INT001","25/01/2019","INTERNET",75.0,"Rogers",15);
        HydroBill H1    = new HydroBill("HYD001", "28/07/1995", "HYDRO", 444.0, "Bell", 23);


        customer customer1 = new customer("C0001", "Gagandeep", "kaur", "gagan@gmail.com");
        customer customer2 = new customer("C0002", "evneet", "kaur", "evneet@yahoo.com");
        customer customer3 = new customer("C0003", "ramneet", "Kaur", "ramneet@yahoo.com");
        customer1.addBill("HYD", H1);

        customer2.addBill(H1.getBillId(), H1);
        customer3.addBill(M1.getBillId(),M1);
        customer2.addBill(I1.getBillId(),I1);


        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    public void addcustomer(customer customer) {
        customers.add(customer);
    }



}
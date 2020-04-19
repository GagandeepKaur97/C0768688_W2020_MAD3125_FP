package com.gagan.c0768688_w2020_mad3125_fp.Repo;

import com.gagan.c0768688_w2020_mad3125_fp.classes.HydroBill;
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

        HydroBill H1 = new HydroBill("HYD001", "28/07/1995", "hydro", 444.0, "gagan", 23);
        customer customer1 = new customer("C0001", "Gagandeep", "kaur", "gagan@gmail.com");
        customer customer2 = new customer("C0002", "evneet", "kaur", "evneet@yahoo.com");
        customer customer3 = new customer("C0003", "ramneet", "Kaur", "ramneet@yahoo.com");
        customer1.addBill("HYD", H1);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    public void addcustomer(customer customer) {
        customers.add(customer);
    }


    public boolean mobileValidation(String s) {
        if (s.length() == 10) {
            return true;
        }
        return false;
    }



    public String doubleFormatter(Double d)
    {
        return String.format("$ " + "%,.2f", d);
    }
    public boolean emailValidation(String s) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
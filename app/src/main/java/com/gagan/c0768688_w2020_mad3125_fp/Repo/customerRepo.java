package com.gagan.c0768688_w2020_mad3125_fp.Repo;

import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;

import java.util.ArrayList;

public class customerRepo {
    private static customerRepo dataStorage = new customerRepo();
    private ArrayList<com.gagan.c0768688_w2020_mad3125_fp.classes.customer> customers = new ArrayList<>();

    public customerRepo () {

        loadDetails();
    }

    public static customerRepo  getInstance(){
        return dataStorage;
    }

    public ArrayList<customer> getCustomers(){
        return this.customers;
    }
    public void loadDetails(){
        customer customer1 = new customer("C0001","Gagandeep","kaur","gagan@gmail.com");
        customer customer2 = new customer("C0002","evneet","kaur","evneet@yahoo.com");
        customer customer3 = new customer("C0003","ramneet","Kaur","ramneet@yahoo.com");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    public void addcustomer(customer customer)
    {
        customers.add(customer);
    }

}

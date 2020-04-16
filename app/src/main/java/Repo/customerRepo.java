package Repo;

import classes.customer;

import java.util.ArrayList;

public class customerRepo {
    private static customerRepo dataStorage = new customerRepo();
    private ArrayList<classes.customer> customer = new ArrayList<>();

    public customerRepo () {
    }

    public static customerRepo  getInstance(){
        return dataStorage;
    }

    public ArrayList<customer> getCustomer(){
        return this.customer;
    }
    public void loadDetails(){
        customer customer1 = new customer("C0001","Gagandeep","kaur","gagan@gmail.com");
        customer customer2 = new customer("C0002","evneet","kaur","evneet@yahoo.com");
        customer customer3 = new customer("C0003","ramneet","Kaur","ramneet@yahoo.com");
        customer.add(customer1);
        customer.add(customer2);
        customer.add(customer3);
    }

}

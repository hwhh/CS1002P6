package com.company;

import java.util.ArrayList;
import java.util.*;

public class Order {
    protected ArrayList<Item> order = new ArrayList<Item>();
    public static int nextOrderID =1;
    protected int orderID;
    private Customer customer;
    private Employee employee;
    protected float orderTotal;
    private Date orderDate;
    private int noOfItemsOrdered;

    /* Constructor, set the attributes of any order and creates orderID*/
    public Order(Customer customer, Employee employee) {
        this.customer = customer;
        this.employee = employee;
        this.orderDate = new Date();
        setID();
    }

    private void setID() {
        //Set the new authors ID to the static variable 'nextOrderID'
        this.orderID = nextOrderID;
        //Increment nextOrderID by 1
        this.nextOrderID++;
    }

    /*When an employees processes an order this method is executed
    the order total is recorded and the number of items is also recorded.
    Every item in the current order is added to an array, the customers
    account is the charged the total of the order. Finally the customers basket
    is reset and the order complete attribute is set to false*/
    public void addOrder (Customer customer){
        float tempOrderTotal = 0;
        int count = 0;
        for (Item item: customer.basket) {
            //Cycle through each item in the customers basket
            item.quantity--;//Update quantity of each item in basket
            count++;
            tempOrderTotal+=item.price;//Update running total
            order.add(item);//Add the current item to the order array
        }
        customer.account.withdraw(tempOrderTotal);//Update the customers account
        noOfItemsOrdered=count;
        orderTotal=tempOrderTotal;
        customer.basket.clear();//Clear customers basket
        customer.orderComplete=false;
    }

    //Print all the details of order
    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderTotal=" + orderTotal +
                ", orderDate=" + orderDate +
                ", noOfItemsOrdered=" + noOfItemsOrdered +
                '}'+"\n";
    }
}

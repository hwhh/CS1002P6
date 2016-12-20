package com.company;

import java.util.ArrayList;

public class Employee extends Person {
    protected static ArrayList<Order> orders = new  ArrayList<Order>();
    public static int nextID =1;
    private int staffID;
    private String address, contactNo;
    private int salary;
    private float totalSales;
    private float bonus;
    private Order currentOrder;

    /* Constructor, uses super to get employee,
       and sets other employee attributes*/
    public Employee(String name , String address, String contactNo, int salary) {
        super(name);
        this.address = address;
        this.contactNo = contactNo;
        this.salary = salary;
        setID();

    }

    private void setID() {
        //Set the new employee ID to the static variable 'nextID'
        this.staffID = nextID;
        //Increment nextID by 1
        this.nextID++;
    }

   /* Sets the current order that the current employee
      is working on, to an order handed in as a parameter */
    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    //Gets the current employees bonus
    public float getBonus() {
        return bonus;
    }

    //Sets the current employees bonus
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    /*When a given customer sets an order as complete, an employee
      can then go ahead and process the order
     */
    public void processOrders(Customer customer) {
        if (customer.orderComplete) {
            //Calls the a method on the current order
            currentOrder.addOrder(customer);
            //Add the order to the orders array
            orders.add(currentOrder);
            //Increment the employees total sales accordingly
            totalSales = currentOrder.orderTotal;
        }
    }

    //Get the total sales of the current employee
    public float getTotalSales() {
        return totalSales;
    }

    /*If an order is deleted by the customer, or employee. The stock needs
      of the items in the order needs to be updated, the employees total sales
      needs to amended and the customers account needs to be credited,
      the method takes the orderID of the order and preforms liner search to find the order*/
    public void deleteOrder (int orderID, Customer customer){
        int count = 0;
        int total = 0;
        for (Order order: orders) {
            //Cycle through each order in array of all orders processed by the current employee
            if (order.orderID == orderID){
                 /* If orderID of current order matches the orderID
                   handed in as parameter, the updates are made */
                totalSales -= order.orderTotal;
                for (Item item: order.order) {
                    item.quantity++;
                    total+=item.price;

                }
                orders.remove(count);//The order is then removed from the orders array
                customer.account.deposit(total);//The account of customer is credited the order total amount
                break;//Loop broken, procedure ends
            }
            count++;

        }


    }

    //Print all the details of employee
    @Override
    public String toString() {
        return "Employee{" +
                "staffID=" + staffID +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", salary=" + salary +
                ", totalSales=" + totalSales +
                ", bonus=" + bonus +
                '}';
    }
}

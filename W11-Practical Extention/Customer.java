package com.company;

import java.util.ArrayList;


public class Customer extends Person {
    public ArrayList<Item> basket = new  ArrayList<Item>();
    protected String email, address;
    private static int nextID =1;
    protected int ID;
    protected boolean orderComplete;
    protected Account account;


    /* Constructor, uses super to get name of new customer
       and separate method to generate new customer ID number*/
    public Customer(String name, String email, String address ) {
        super(name);
        this.email = email;
        this.address = address;
        setID();
    }

    private void setID() {
        //Set the new customer ID to the static variable 'nextID
        this.ID = nextID;
        //Increment nextID by 1
        this.nextID++;
    }

    //Set the complete order atribute to true to allow employee to process order
    public void completeOrder (){
        orderComplete=true;
    }

    //Print all the details of customer
    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", basket=" + basket +
                ", ID=" + ID +
                ", orderComplete=" + orderComplete +
                ", account balance=" + account.balance +
                '}';
    }

    //Display all the items in the current customers basket
    public void displayBasket(){
        int i = 0;
        for (Item item : basket) {
            //Cycle through each item in basket array
            System.out.println(i+". "+item.toString());
            i++;
        }
    }

    //Add a new item to current customer basket
    public void addItem(Item item){
        basket.add(item);
    }

    /*Remove an existing item from the array of items in current customers basket
      Takes the uniqueItemCode of the item and preforms liner search */
    public void removeItem(int uniqueItemCode){
        for (Item item : basket) {
            //Cycle through each item in basket array
            if (item.uniqueItemCode == uniqueItemCode)
                 /* If uniqueItemCode of current item matches the uniqueItemCode
                   handed in as parameter, that item is removed */
                basket.remove(item);
                break;//Loop broken, procedure ends
        }

    }

    /*Calculate the total of the customers basket and decide
    whether they recive free postage or how much postage they need
    to pay*/
    public float basketTotal() {
        float total = 0;
        int count = 0;
        for (Item item : basket) {
            //Cycle through each item in basket array
            if (item instanceof ElectronicBook)
                total+= item.price;
            else
                total+= item.price;
                count++;
            //Calculate the basket total and how many items in basket
        }
        //If total spend over £20 free shipping
        if (total < 20f) {
            System.out.printf("%nSub-total: £%.2f + £" +count +" shipping"+ " %nTOTAL: £%.2f", total-count, total);
            return total += count;
        }
        //Else total spend is less that £20, thus shipping is £1 for each item
        else {
            //No shipping charge for electronic items
            System.out.printf("%nTotal (Free shipping): £%.2f " , total);
            return total;

        }
    }

    //Return current customers email
    public String getEmail() {
        return email;
    }

    //Update the current customers email
    public void setEmail(String email) {
        this.email = email;
    }

    //Return the current customers email
    public String getAddress() {
        return address;
    }

    //Update the current customers address
    public void setAddress(String address) {
        this.address = address;
    }


}

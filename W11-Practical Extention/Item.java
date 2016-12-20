package com.company;

public class Item {
    public static int nextUniqueItemCode =1;
    protected int uniqueItemCode;
    protected int quantity;
    protected String name;
    protected float price;

    /* Constructor for super class, set the attributes of any item*/
    public Item(int quantity, String name, float price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        setUniqueItemCode();
    }

    //Return the UniqueItemCode for each item
    public int getUniqueItemCode() {
        return uniqueItemCode;
    }

    private void setUniqueItemCode() {
        //Set the new item ID to the static variable 'nextUniqueItemCode'
        this.uniqueItemCode = nextUniqueItemCode;
        //Increment nextUniqueItemCode by 1
        this.nextUniqueItemCode++;
    }

    //Return the quantity of a given object
    public int getQuantity() {
        return quantity;
    }

    //Set the quantity of a given object
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Return the price of a given object
    public float getPrice() {
        return price;
    }

    //Set the price of a given object
    public void setPrice(float price) {
        this.price = price;
    }

    //Return the name of a given object
    public String getName() {
        return name;
    }

    //Print all the details of item
    @Override
    public String toString() {
        return "Item{" +
                "uniqueItemCode=" + uniqueItemCode +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.company;

public class Item {
    protected static int nextUniqueItemCode =1;
    protected int uniqueItemCode;
    protected int quantity;
    protected String name;
    protected float price;

    public Item(int quantity, String name, float price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        setUniqueItemCode();
    }

    public int getUniqueItemCode() {
        return uniqueItemCode;
    }

    public void setUniqueItemCode() {
        this.uniqueItemCode = nextUniqueItemCode;
        this.nextUniqueItemCode++;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

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

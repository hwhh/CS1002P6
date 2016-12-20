package com.company;

import java.util.ArrayList;


public class Customer extends Person {
    protected String email, address;
    protected ArrayList<Item> basket = new  ArrayList<Item>();


    public Customer(String name, String email, String address) {
        super(name);
        this.email = email;
        this.address = address;
    }

    public void displayBasket(){
        int i = 0;
        for (Item item : basket) {
            System.out.println(i+". "+item.toString());
            i++;
        }
    }

    public void addItem(Item item){
        basket.add(item);
    }

    public void removeItem(int uniqueItemCode){
        for (Item item : basket) {
            if (item.uniqueItemCode == uniqueItemCode)
                basket.remove(item);
                break;
        }

    }

    public float basketTotal() {
        float total = 0;
        int count = 0;

        for (Item item : basket) {
            total+= item.price;
            count++;

        }
        if (total < 20f) {
            System.out.printf("%nSub-total: £%.2f + £" +count +" shipping"+ " %nTOTAL: £%.2f", total-count, total);
            return total += count;
        }
        else {
            System.out.printf("%nTotal (Free shipping): £%.2f " , total);
            return total;

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

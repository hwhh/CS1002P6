package com.company;

public class Account {
    protected Customer customer;
    protected float balance;


    //Account constructor, linking account to customer
    public Account(float balance, Customer customer) {
        this.balance = balance;
        this.customer=customer;
        customer.account=this;
    }

    //Decreases customers balance by 'amount'
    public void withdraw(float ammount) {
        balance -= ammount;
    }

    //Increases customers balance by 'amount'
    public void deposit(float ammount){
        balance += ammount;
    }


}

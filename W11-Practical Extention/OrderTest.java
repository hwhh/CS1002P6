package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderTest {

    Person customer1 = new Customer("Bill Smith", "billsmith@hotmail.com" ,"flat 1");
    Person employee1 = new Employee("John Taylor", "johnTaylor@company.com" ,"12345678901", 20000);
    Order order1 = new Order((Customer) customer1, (Employee) employee1);
    Account account1 = new Account(100, (Customer) customer1);

    Item stationary1 = new Stationary(20, "Biro", 0.5f, EnumClasses.type.Pen);
    Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, "Paper Back");
    Item book2 = new Book(20, "Money", 10f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, "Paper Back");





    @Test
    public void testAddOrder() throws Exception {
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).addItem(book2);
        ((Customer) customer1).completeOrder();
        ((Employee) employee1).setCurrentOrder(order1);
        ((Employee) employee1).processOrders((Customer) customer1);
        assertThat(order1.order.get(0), anyOf(is(stationary1), is(book1), is(book2)));


    }
}
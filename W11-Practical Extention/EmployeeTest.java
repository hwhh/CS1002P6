package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EmployeeTest {

    Person customer1 = new Customer("Bill Smith", "billsmith@hotmail.com" ,"flat 1");
    Person employee1 = new Employee("John Taylor", "johnTaylor@company.com" ,"12345678901", 20000);
    Order order1 = new Order((Customer) customer1, (Employee) employee1);
    Item stationary1 = new Stationary(20, "Biro", 0.5f, EnumClasses.type.Pen);
    Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, "Hard Back");
    Item book2 = new Book(20, "Money", 10f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, "Paper Back");
    Account account1 = new Account(100, (Customer) customer1);


    @Test
    public void testProcessOrders() throws Exception {
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).addItem(book2);

        ((Customer) customer1).completeOrder();

        ((Employee) employee1).setCurrentOrder(order1);
        ((Employee) employee1).processOrders((Customer) customer1);
        assertEquals(((Employee) employee1).getTotalSales(),30.5, 0);
        System.out.println(customer1.toString());
    }

    @Test
    public void testCancelOrder() throws Exception {
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).addItem(book2);
        ((Customer) customer1).completeOrder();
        ((Employee) employee1).setCurrentOrder(order1);
        ((Employee) employee1).processOrders((Customer) customer1);
        assertEquals(stationary1.quantity, 19);
        assertEquals(book1.quantity, 19);
        assertEquals(book2.quantity, 19);
        ((Employee) employee1).deleteOrder(order1.orderID, (Customer) customer1);
        assertEquals(stationary1.quantity, 20);
        assertEquals(book1.quantity, 20);
        assertEquals(book2.quantity, 20);
        assertEquals(((Employee) employee1).getTotalSales(), 0f, 0);
    }

    @Test
    public void testSetName() throws Exception {
        ((Employee) employee1).setName("test");
        assertEquals(employee1.name, "test");
    }
}
package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Item stationary1 = new Stationary(20, "Biro", 0.5f, EnumClasses.type.Pen);
    Person customer1 = new Customer("Bill Smith", "billsmith@hotmail.com" ,"flat 1");
    Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction);
    Item book2 = new Book(20, "Money", 10f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction);
    Person author1 = new Author("Bill Smith", "01288359872", "Ocean View");

    @Test
    public void testAddItem() throws Exception {
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        assertEquals(((Customer) customer1).basket.get(0),stationary1);
        assertEquals(((Customer) customer1).basket.get(1),book1);
        assertNotEquals(((Customer) customer1).basket.get(1),stationary1);
    }

    @Test
    public void testRemoveItem() throws Exception {
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).removeItem(stationary1.uniqueItemCode);
        ((Customer) customer1).removeItem(book1.uniqueItemCode);
        assertTrue(((Customer) customer1).basket.isEmpty());
    }

    @Test
    public void testBasketTotal() throws Exception {
        ///////////////OVER £20///////////////
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book1);
        float testTotal=stationary1.price+book1.price;
        float total = ((Customer) customer1).basketTotal();
        assertEquals(total, testTotal, 0);

        ///////////////UNDER £20///////////////
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(book2);
        float testTotal1=stationary1.price+book2.price+2;
        float total1 = ((Customer) customer1).basketTotal();
        assertEquals(total, testTotal, 0);
    }

    @Test
    public void testSetEmail() throws Exception {
        ((Customer) customer1).setEmail("test@test.com");
        assertEquals(((Customer) customer1).email,"test@test.com");
    }

    @Test
    public void testSetAddress() throws Exception {
        ((Customer) customer1).setAddress("test address");
        assertEquals(((Customer) customer1).address,"test address");
    }

    @Test
    public void testSetName() throws Exception {
        customer1.setName("test name");
        assertEquals(customer1.name, "test name");
    }
}
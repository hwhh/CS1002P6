package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class BookTest {
    Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction);
    Person author1 = new Author("Bill Smith", "01288359872", "Ocean View");

    @Test
    public void testAddAuthors() throws Exception {
        ((Book) book1).authors.clear();
        ((Book) book1).addAuthors((Author) author1);
        assertEquals(((Book) book1).authors.get(0),author1);
    }

    @Test
    public void testRemoveAuthors() throws Exception {
        ((Book) book1).authors.clear();
        ((Book) book1).addAuthors((Author)author1);
        ((Book) book1).removeAuthors(((Author) author1).ID);
        assertTrue(((Book) book1).authors.isEmpty());
    }


    @Test
    public void testSetPublisher() throws Exception {
        ((Book) book1).setPublisher("Penguin");
        assertEquals(((Book) book1).publisher, "Penguin");

    }

    @Test
    public void testSetQuantity() throws Exception {
        book1.setQuantity(10);
        assertEquals(book1.quantity,10);

    }

    @Test
    public void testSetPrice() throws Exception {
        book1.setPrice(10f);
       assertEquals(book1.price,10f,0);
    }
}
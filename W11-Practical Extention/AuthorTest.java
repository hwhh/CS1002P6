package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AuthorTest {
    Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction , "Hard Back");
    Author author1 = new Author("Bill Smith", "01288359872", "Ocean View");


    @Test
    public void testAddBook() throws Exception {
       /* author1.books.clear();
        author1.addBook((Book) book1);
        assertEquals(author1.books.get(0),book1);*/
    }

    @Test
    public void testRemoveBook() throws Exception {
       /* author1.books.clear();
        author1.addBook((Book) book1);
        author1.removeBook(book1.uniqueItemCode);
        assertTrue(author1.books.isEmpty());*/

    }

    @Test
    public void testAddGenre() throws Exception {
        author1.genres.clear();
        author1.addGenre(EnumClasses.genre.Drama);
        assertEquals(author1.genres.get(0),EnumClasses.genre.Drama);
    }


    @Test
    public void testSetAgentContactNo() throws Exception {
        author1.setAgentContactNo("1234");
        assertEquals(author1.agentContactNo, "1234");
    }

    @Test
    public void testSetAddress() throws Exception {
        author1.setAddress("House");
        assertEquals(author1.address, "House");
    }

    @Test
    public void testSetName() throws Exception {
        author1.setName("Bill");
        assertEquals(author1.name, "Bill");
    }
}
package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.io.*;

public class Main {


    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Item> items = new ArrayList<Item>();


    public static void main(String[] args) {
        Item electronicBook1 = new ElectronicBook(100, "Book1", 20f, "Penguin", "99-7764-951-0", EnumClasses.genre.Comedy, 90f);
        Item Book1 = new Book(10, "Book2", 10f, "Penguin", "99-7764-951-1", EnumClasses.genre.Comedy);
        Item Book2 = new Book(50, "Book3", 7f, "Penguin", "99-7764-951-2", EnumClasses.genre.Comedy);
        Item electronicBook2 = new ElectronicBook(62, "Book4", 5f, "Penguin", "99-7764-951-3", EnumClasses.genre.Comedy, 80f);


        Item Book3 = new Book(5, "Book5", 2f, "Penguin", "99-7764-951-4", EnumClasses.genre.Drama);

        items.add(electronicBook1);
        items.add(electronicBook2);
        items.add(Book1);
        items.add(Book2);
        items.add(Book3);

        books.add((ElectronicBook)electronicBook1);
        books.add((ElectronicBook)electronicBook2);
        books.add((Book) Book1);
        books.add((Book)Book2);
        books.add((Book)Book3);

        valueOfStock();
        allStockItems();
        booksOfGenre(EnumClasses.genre.Comedy);
    }

    public static void booksOfGenre(EnumClasses.genre bookGenre){
        String bookInfo = null;
        System.out.println("//////////////////BOOKS OF GENRE :"+ bookGenre +"//////////////////");
        for (Book book : books) {
            if (book.bookGenre==bookGenre){
                System.out.println(book.toString());
            }
        }


    }

    public static double valueOfStock (){
        double total = 0;
        for (Item item : items) {
            total+=item.quantity*item.price;
        }
        System.out.println("Total value of stock: £"+total);
        return total;
    }

    public static void allStockItems (){
        double total = 0;
        System.out.println("//////////////////ALL STOCK ITEMS//////////////////");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }


















          /* ////////////Creating Books////////////
        Item electronicBook1 = new ElectronicBook(1, "New York", 10f, "Penguin", "99-7764-951-0", EnumClasses.genre.Comedy, 90f);
        electronicBook1.setUniqueItemCode();
        Item electronicBook2 = new Book(1, "New Jersey", 5f, "Red", "96-8587-447-6-0", EnumClasses.genre.Drama);
        electronicBook2.setUniqueItemCode();
        Item book1 = new Book(20, "Money", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction);
        book1.setUniqueItemCode();

        ////////////Creating People////////////
        Author author1 = new Author("Bill Smith", "01288359872", "Ocean View");
        author1.addBook((Book) electronicBook1);
        author1.addBook((Book) book1);
        author1.removeBook(1);

        System.out.println(author1.toString());
        System.out.println(book1.toString());


       Person[] people = new Person[10];
        people[0] = person2;
        Student temp = (Student)people[0];
        String string2=person2.toString();
        System.out.println(string2)*/;

}

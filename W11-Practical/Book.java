package com.company;

import java.util.ArrayList;

public class Book extends Item {
    protected ArrayList<Author> authors = new ArrayList<Author>();
    protected String publisher, ISBN;
    protected EnumClasses.genre bookGenre;
    protected String type;

    public Book(int quantity, String name, float price, String publisher, String ISBN, EnumClasses.genre bookGenre) {
        super(quantity, name, price);
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.bookGenre = bookGenre;

    }

    public EnumClasses.genre getBookGenre() {
        return bookGenre;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthors(Author author) {
        this.authors.add(author);
    }

    public void removeAuthors(int ID){
        for (Author author : authors) {
            if (author.ID == ID) {
                authors.remove(author);
                break;
            }
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        String details=  super.toString();
        details +="Book{" +
                "authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", ISBN=" + ISBN +
                '}';
        return details;
    }



}

package com.company;

import java.util.ArrayList;

public class Book extends Item {
    protected ArrayList<Author> authors = new ArrayList<Author>();
    protected String publisher, ISBN;
    protected EnumClasses.genre bookGenre;
    protected String type;

    /* Constructor, uses super to get quantity, name and price
        of new book*/

    public Book(int quantity, String name, float price, String publisher, String ISBN, EnumClasses.genre bookGenre) {
        super(quantity, name, price);
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.bookGenre = bookGenre;
    }

    public Book(int quantity, String name, float price, String publisher, String ISBN, EnumClasses.genre bookGenre, String bookType) {
        super(quantity, name, price);
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.bookGenre = bookGenre;
        this.type=bookType;
    }




    //Returns the current books genre
    public EnumClasses.genre getBookGenre() {
        return bookGenre;
    }

    //Returns the author(s) of the current book
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    //Allows an author to be added to a book
    public void addAuthors(Author author) {
        try {
            this.authors.add(author);
            author.books.add(this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*Remove an existing author from the array of authors who wrote the current book
      Takes the ID of the author and preforms liner search */
    public void removeAuthors(int ID){
        for (Author author : authors) {
            //Cycle through each author in array of all authors of a book
            if (author.ID == ID) {
                /* If ID of current author matches the ID
                   handed in as parameter, that author is removed */
                authors.remove(author);
                break;//Loop broken, procedure ends
            }
        }
    }

    //Returns the publisher of the current book
    public String getPublisher() {
        return publisher;
    }

    //Sets the publisher of the current book
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //Returns the ISBN number of the current book
    public String getISBN() {
        return ISBN;
    }

    //Print all the details of current book


    @Override
    public String toString() {
        return "Book{" +
                "publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", bookGenre=" + bookGenre +
                ", type='" + type + '\'' +
                '}';
    }


}

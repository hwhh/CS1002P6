package com.company;

import java.util.ArrayList;

public class Author extends Person {
    protected ArrayList<EnumClasses.genre> genres = new  ArrayList<EnumClasses.genre>();
    protected ArrayList<Book> books = new  ArrayList<Book>();
    protected String agentContactNo, address;
    private static int nextID =1;
    protected int ID;


    /* Constructor, uses super to get name of new author
       and separate method to generate new authors ID number*/
    public Author(String name, String agentContactNo, String address) {
        super(name);
        this.agentContactNo = agentContactNo;
        this.address = address;
        setID();
    }

    public void setID() {
        //Set the new authors ID to the static variable 'nextID'
        this.ID = nextID;
        //Increment nextID by 1
        this.nextID++;
    }

    //Print out all denials of all books written by an author
    public void displayBooks(){
        int i = 0;
        for (Item book : books) {
            //Cycle through each book in array of all books written by an author
            System.out.println(i+". "+book.toString());
            i++;
        }
    }

    //Add a new book to array of all books written by an author
    public void addBook(Book book){
        try {
            this.books.add(book);
            book.authors.add(this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*Remove an existing book from the array of all books written by an author
      Takes the uniqueItemCode of the book and preforms liner search */
    public void removeBook(int uniqueItemCode){
        for (Item book : books) {
            //Cycle through each book in array of all books written by an author
            if (book.uniqueItemCode == uniqueItemCode) {
                /* If uniqueItemCode of current book matches the uniqueItemCode
                   handed in as parameter, that book is removed */
                books.remove(book);
                break;//Loop broken, procedure ends
            }
        }
    }

    //Display all the different book genres aviable
    public void displayGenres(){
        int i = 0;
        for (EnumClasses.genre genre : genres) {
            //Cycle through each genre in genre array
            System.out.println(i+". "+genre.toString());
            i++;
        }
    }

    //Add a new genre to the genre array
    public void addGenre(EnumClasses.genre genre){
        genres.add(genre);
    }


   /* @Override
    public String toString() {
        //Takes authors name from super class, person

        String details= super.toString();
        details+=" Author{" +
                "genres=" + genres +
                ", agentContactNo='" + agentContactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
        return details;
    }*/

    //Print all the details of author
    @Override
    public String toString() {
        return "Author{" +
                "genres=" + genres +
                ", books=" + books +
                ", agentContactNo='" + agentContactNo + '\'' +
                ", address='" + address + '\'' +
                ", ID=" + ID +
                '}';
    }

    //Get the authors agent contact number
    public String getAgentContactNo() {
        return agentContactNo;
    }

    //Set the authors agent contact number
    public void setAgentContactNo(String agentContactNo) {
        this.agentContactNo = agentContactNo;
    }

    //Get the authors address
    public String getAddress() {
        return address;
    }

    //Set the authors address
    public void setAddress(String address) {
        this.address = address;
    }
}

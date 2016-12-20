package com.company;

import java.util.ArrayList;

public class Author extends Person {
    protected ArrayList<EnumClasses.genre> genres = new  ArrayList<EnumClasses.genre>();
    protected ArrayList<Book> books = new  ArrayList<Book>();
    protected String agentContactNo, address;
    private static int nextID =1;
    protected int ID;



    public Author(String name, String agentContactNo, String address) {
        super(name);
        this.agentContactNo = agentContactNo;
        this.address = address;
        setID();
    }

    public void setID() {
        this.ID = nextID;
        this.nextID++;
    }

    public void displayBooks(){
        int i = 0;
        for (Item book : books) {
            System.out.println(i+". "+book.toString());
            i++;
        }
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(int uniqueItemCode){
        for (Item book : books) {
            if (book.uniqueItemCode == uniqueItemCode) {
                books.remove(book);
                break;
            }
        }
        displayBooks();

    }

    public void displayGenres(){
        int i = 0;
        for (EnumClasses.genre genre : genres) {
            System.out.println(i+". "+genre.toString());
            i++;
        }
    }

    public void addGenre(EnumClasses.genre genre){
        genres.add(genre);
    }

    @Override
    public String toString() {
        String details= super.toString();
        details+=" Author{" +
                "genres=" + genres +
                ", books=" + books +
                ", agentContactNo='" + agentContactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
        return details;
    }

    public ArrayList getGenres() {
        return genres;
    }

    public String getAgentContactNo() {
        return agentContactNo;
    }

    public void setAgentContactNo(String agentContactNo) {
        this.agentContactNo = agentContactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}




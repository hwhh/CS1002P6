package com.company;

public class ElectronicBook extends Book {
    private float size;

    /* Constructor, uses super to get quantity, name, price, publisher, ISBN
       and bookGenre and sets the size of electronic book*/
    public ElectronicBook(int quantity, String name, float price, String publisher, String ISBN, EnumClasses.genre bookGenre, float size) {
        super(quantity, name, price, publisher, ISBN, bookGenre);
        this.size = size;
    }

    //Return the current book size
    public float getSize() {
        return size;
    }

    //Updates the current book size
    public void setSize(float size) {
        this.size = size;
    }

    //Print all the details of electronicBook
    @Override
    public String toString() {
        //Takes book detials from super class, book
        String details = super.toString();
        details += "ElectronicBook{" +
                "size=" + size +
                '}';
        return details;
    }


}


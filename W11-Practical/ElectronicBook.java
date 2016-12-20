package com.company;

public class ElectronicBook extends Book {
    private float size;


    public ElectronicBook(int quantity, String name, float price, String publisher, String ISBN, EnumClasses.genre bookGenre, float size) {
        super(quantity, name, price, publisher, ISBN, bookGenre);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String details = super.toString();
        details += "ElectronicBook{" +
                "size=" + size +
                '}';
        return details;
    }


}


package com.company;

public class Stationary extends Item {
    private EnumClasses.type stationaryType;

    /* Constructor, uses super to get quantity, name and price of new Item */
    public Stationary(int quantity, String name, float price, EnumClasses.type stationaryType) {
        super(quantity, name, price);
        this.stationaryType = stationaryType;
    }

}

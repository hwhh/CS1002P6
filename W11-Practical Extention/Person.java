package com.company;

public class Person {
    protected String name;

    /*Constructor for super class, set the attributes of any item*/
    public Person(String name) {
        this.name = name;
    }

    //Print all the details of person
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    //Return name of current person
    public String getName() {
        return name;
    }

    //Update the name of current person
    public void setName(String name) {
        this.name = name;
    }
}

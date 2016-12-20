package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {


    Person customer1 = new Customer("Jose Y. Albarado", "JoseYAlbarado@teleworm.us" ,"flat 2");
    Person customer2 = new Customer("Geoffrey E. Singh", "GeoffreyESingh@dayrep.com" ,"flat 3");
    Person customer3 = new Customer("Betty P. Dejesus", "BettyPDejesus@teleworm.us" ,"flat 4");
    Person customer4 = new Customer("Mellissa W. Caldwell", "MellissaWCaldwell@jourrapide.com" ,"flat 5");
    Person employee1 = new Employee("Clarice B. Harrison", "ClariceBHarrison@armyspy.com", "079 6459 7748" , 30000);
    Person employee2 = new Employee("Betty J. Smith", "BettyJSmith@dayrep.com" ,"078 6727 9041" , 24000);
    Person employee3 = new Employee("Todd D. Gibbs", "ToddDGibbs@teleworm.us","079 7628 1038" , 29000);

    Account account1 = new Account(4000, (Customer) customer1);
    Account account2 = new Account(4000, (Customer) customer2);
    Account account3 = new Account(4000, (Customer) customer3);
    Account account4 = new Account(4000, (Customer) customer4);

    Order order1 = new Order((Customer) customer1, (Employee) employee1);
    Order order2 = new Order((Customer) customer2, (Employee) employee1);
    Order order3 = new Order((Customer) customer3, (Employee) employee2);
    Order order4 = new Order((Customer) customer4, (Employee) employee3);

    Item stationary1 = new Stationary(50, "Notebook", 20f, EnumClasses.type.Notebook);
    Item stationary2 = new Stationary(70, "Eraser", 40f, EnumClasses.type.Eraser);
    Item book1 = new Book(80, "Fallen Danger", 180f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, "Paper Back");
    Item book2 = new Book(100, "The Bold Girl", 10f, "Blue","96-0993-765-0", EnumClasses.genre.Comedy, "Paper Back");
    Item electronicBook1 = new ElectronicBook(60, "Waves of Edge", 5f, "Penguin", "99-9764-951-3", EnumClasses.genre.Romance, 120f);
    Item electronicBook2 = new ElectronicBook(75, "The Night's Nobody", 3f, "Penguin", "99-8764-951-0", EnumClasses.genre.Comedy, 90f);



    @Test
    public void testValueOfStock() throws Exception {
        Main.items.add(stationary1);
        Main.items.add(stationary2);
        Main.items.add(book1);
        Main.items.add(book2);
        Main.items.add(electronicBook1);
        Main.items.add(electronicBook2);
        double temp = Main.valueOfStock();
        assertEquals(temp, 19725 ,0);
    }


    @Test
    public void testCommissionCalculator() throws Exception {
        Main.employees.add((Employee) employee1);
        Main.employees.add((Employee) employee2);
        Main.employees.add((Employee) employee3);
        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(stationary2);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).addItem(book2);
        ((Customer) customer1).addItem(electronicBook1);
        ((Customer) customer1).addItem(electronicBook2);
        ((Customer) customer1).completeOrder();
        ((Customer) customer2).basket.clear();
        ((Customer) customer2).addItem(book1);
        ((Customer) customer2).completeOrder();
        ((Customer) customer3).basket.clear();
        ((Customer) customer3).addItem(stationary1);
        ((Customer) customer3).addItem(stationary2);
        ((Customer) customer3).completeOrder();
        ((Employee) employee1).setCurrentOrder(order1);
        ((Employee) employee1).processOrders((Customer) customer1);
        ((Employee) employee2).setCurrentOrder(order2);
        ((Employee) employee2).processOrders((Customer) customer2);
        ((Employee) employee3).setCurrentOrder(order3);
        ((Employee) employee3).processOrders((Customer) customer3);

        Main.commissionCalculator();

        assertEquals(((Employee) employee1).getBonus(), 200, 0);
        assertEquals(((Employee) employee2).getBonus(), 100, 0);
        assertEquals(((Employee) employee3).getBonus(), 50, 0);






    }
}
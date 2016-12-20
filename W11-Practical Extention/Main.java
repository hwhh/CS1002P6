package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.io.*;

public class Main {
    public static ArrayList<Person> people  = new ArrayList<Person>();
    public static ArrayList<Item> items = new ArrayList<Item>();
    public static ArrayList<Account> accounts  = new ArrayList<Account>();
    public static ArrayList<Employee> employees  = new ArrayList<Employee>();
    public static ArrayList<Customer> customers  = new ArrayList<Customer>();
    public static ArrayList<Author> authors  = new ArrayList<Author>();
    public static ArrayList<Book> books  = new ArrayList<Book>();
    public static ArrayList<ElectronicBook> electronicBooks = new ArrayList<ElectronicBook>();
    public static ArrayList<Stationary> stationary  = new ArrayList<Stationary>();


    public static Person addCustomer(String name, String email, String address) {
        //Try to add new person - catch any errors
        try {
            Person customer = new Customer(name, email, address);
            people.add(customer);
            customers.add((Customer) customer);
            return customer;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Person addEmployee(String name, String email, String contactNo, int salary) {
        //Try to add new person - catch any errors
        try {
            Person employee = new Employee(name, email, contactNo, salary);
            people.add(employee);
            employees.add((Employee) employee);
            return employee;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Person addAuthor(String name, String agentContactNo, String address) {
        //Try to add new person - catch any errors
        try {
            Person author = new Author(name, agentContactNo, address);
            people.add(author);
            authors.add((Author) author);
            return author;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Account addAccount(int balance, Customer customer) {
        //Try to add new person - catch any errors
        try {
            Account account = new Account(balance, customer);
            accounts.add(account);
            return account;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Item addStationary(int quantity, String title, float price, EnumClasses.type type) {
        //Try to add new person - catch any errors
        try {
            Item stationaryItem = new Stationary(quantity, title, price, type);
            items.add(stationaryItem);
            stationary.add((Stationary) stationaryItem);
            return stationaryItem;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Item addBook(int quantity, String title, float price, String publisher, String ISBN, EnumClasses.genre genre, Author author, String bookType) {
        //Try to add new person - catch any errors
        try {
            Item book = new Book(quantity, title, price,publisher, ISBN, genre, bookType);
            //((Book) book).addAuthors(author);
            items.add(book);
            books.add((Book) book);
            return book;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Item addElectronicBook(int quantity, String title, float price, String publisher, String ISBN, EnumClasses.genre genre, float size, Author author) {
        //Try to add new person - catch any errors
        try {
            Item electronicBook = new ElectronicBook(quantity, title, price,publisher, ISBN, genre, size);
            ((ElectronicBook) electronicBook).addAuthors(author);
            items.add(electronicBook);
            electronicBooks.add((ElectronicBook) electronicBook);
            return electronicBook;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }



    public static void main(String[] args) {


        //////////////////////////////CUSTOMERS//////////////////////////////
        Person customer1 = addCustomer("Bill Smith", "billsmith@hotmail.com" ,"flat 1");
        Person customer2 = addCustomer("Jose Y. Albarado", "JoseYAlbarado@teleworm.us" ,"flat 2");
        Person customer3 = addCustomer("Geoffrey E. Singh", "GeoffreyESingh@dayrep.com" ,"flat 3");
        Person customer4 = addCustomer("Betty P. Dejesus", "BettyPDejesus@teleworm.us" ,"flat 4");
        Person customer5 = addCustomer("Mellissa W. Caldwell", "MellissaWCaldwell@jourrapide.com" ,"flat 5");
        Person customer6 = addCustomer("Rafael E. West", "RafaelEWest@teleworm.us" ,"flat 6");
        Person customer7 = addCustomer("Robin K. Hecker","RobinKHecker@jourrapide.com"  ,"flat 7");
        Person customer8 = addCustomer("Erin C. Moon", "ErinCMoon@armyspy.com" ,"flat 8");
        Person customer9 = addCustomer("Elizabeth C. Tran", "ElizabethCTran@armyspy.com" ,"flat 9");
        Person customer10 = addCustomer("Reva R. Garza", "RevaRGarza@armyspy.com" ,"flat 10");

        //////////////////////////////EMPLOYEES//////////////////////////////
        Person employee1 = addEmployee("John Taylor", "johnTaylor@company.com" ,"070 0651 3033", 20000);
        Person employee2 = addEmployee("Clarice B. Harrison", "ClariceBHarrison@armyspy.com", "079 6459 7748" , 30000);
        Person employee3 = addEmployee("Betty J. Smith", "BettyJSmith@dayrep.com" ,"078 6727 9041" , 24000);
        Person employee4 = addEmployee("Todd D. Gibbs", "ToddDGibbs@teleworm.us","079 7628 1038" , 29000);
        Person employee5 = addEmployee("Corey S. Hughes", "CoreySHughes@jourrapide.com" ,"078 0259 8724" , 21000);

        //////////////////////////////AUTHORS//////////////////////////////
        Person author1 = addAuthor("Bill Smith", "078 0798 4563", "8 Cefn Road");
        Person author2 = addAuthor("Adam A. Boggs", "070 3646 1452", "66 Asfordby Rd");
        Person author3 = addAuthor("Angela H. Rodriquez","070 7889 8824" , "93 Front Street");
        Person author4 = addAuthor("Richard B. Cox", "070 7484 7936" ,"55 Fox Lane" );
        Person author5 = addAuthor("Juan T. Winter", "079 5569 7172" , "32 Bootham Terrace");

        //////////////////////////////ACCOUNTS//////////////////////////////
        Account account1 = addAccount(100, (Customer) customer1);
        Account account2 = addAccount(200, (Customer) customer2);
        Account account3 = addAccount(1000, (Customer) customer3);
        Account account4 = addAccount(500, (Customer) customer4);
        Account account5 = addAccount(400, (Customer) customer5);
        Account account6 = addAccount(350, (Customer) customer6);
        Account account7 = addAccount(600, (Customer) customer7);
        Account account8 = addAccount(50, (Customer) customer8);
        Account account9 = addAccount(230, (Customer) customer9);
        Account account10 = addAccount(420, (Customer) customer10);

        //////////////////////////////STATIONARY//////////////////////////////
        Item stationary1 = addStationary(20, "Biro", 0.5f, EnumClasses.type.Pen);
        Item stationary2 = addStationary(40, "Pencil", 1f, EnumClasses.type.Pencil);
        Item stationary3 = addStationary(10, "Notebook", 2f, EnumClasses.type.Notebook);
        Item stationary4 = addStationary(25, "Eraser", 0.2f, EnumClasses.type.Eraser);
        Item stationary5 = addStationary(100, "Paper", 0.1f, EnumClasses.type.Paper);
        Item stationary6 = addStationary(40, "Diary", 2.5f, EnumClasses.type.Diary);

        //////////////////////////////BOOKS//////////////////////////////
        Item book1 = addBook(20, "Fallen Danger", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, (Author) author1, "Hard Back");
        Item book2 = addBook(20, "The Bold Girl", 100f, "Blue","96-0993-765-0", EnumClasses.genre.Comedy, (Author)author2, "Paper Back");
        Item book3 = addBook(10, "Guardian of Force", 10f, "Penguin", "95-7764-951-1", EnumClasses.genre.Drama, (Author)author3, "Hard Back");
        Item Book4 = addBook(50, "The Husband's Secrets", 7f, "Penguin", "94-7764-951-2", EnumClasses.genre.Romance, (Author)author4 , "Paper Back");
        Item book5 = addBook(20, "The Wings of the Waves", 15f, "Blue","93-0993-765-0", EnumClasses.genre.NonFiction, (Author)author5, "Paper Back");
        Item book6 = addBook(20, "Waves in the Luck", 12f, "Blue","92-0993-765-0", EnumClasses.genre.Tragedy, (Author) author1, "Hard Back");
        Item Book7 = addBook(10, "Bloody Emerald", 18f, "Penguin", "91-7764-951-1", EnumClasses.genre.Drama, (Author) author2, "Paper Back");
        Item Book8 = addBook(50, "The Vacant Illusion", 5f, "Penguin", "90-7764-951-2", EnumClasses.genre.NonFiction, (Author)author3, "Hard Back");

        //////////////////////////////ELECTRONIC BOOKS//////////////////////////////
        Item electronicBook1 = addElectronicBook(60, "Waves of Edge", 5f, "Penguin", "99-9764-951-3", EnumClasses.genre.Romance, 120f, (Author) author2);
        Item electronicBook2 = addElectronicBook(100, "The Night's Nobody", 20f, "Penguin", "99-8764-951-0", EnumClasses.genre.Comedy, 90f, (Author) author1);
        Item electronicBook3 = addElectronicBook(40, "The Boy of the Man", 15f, "Penguin", "99-7764-951-3", EnumClasses.genre.NonFiction, 80f, (Author) author5);
        Item electronicBook4 = addElectronicBook(200, "Lights in the Dream", 10f, "Penguin", "99-6764-951-0", EnumClasses.genre.Drama, 55f, (Author) author4);
        Item electronicBook5 = addElectronicBook(50, "Broken Courage", 2f, "Penguin", "99-5764-951-3", EnumClasses.genre.Romance, 240f, (Author) author3);
        Item electronicBook6 = addElectronicBook(75, "The Shadowy Slaves", 25f, "Penguin", "99-4764-951-0", EnumClasses.genre.NonFiction, 110f, (Author) author2);

        //////////////////////////////ORDERS//////////////////////////////
        Order order1 = new Order((Customer) customer1, (Employee) employee1);
        Order order2 = new Order((Customer) customer2, (Employee) employee2);
        Order order3 = new Order((Customer) customer3, (Employee) employee3);
        Order order4 = new Order((Customer) customer4, (Employee) employee4);


        //////////////////////////////TESTs//////////////////////////////

        for (Person person : people) {
            System.out.println(person.toString());
        }
        for (Item item : items) {
            System.out.println(item.toString());
        }


        ((Customer) customer1).basket.clear();
        ((Customer) customer1).addItem(stationary1);
        ((Customer) customer1).addItem(stationary2);
        ((Customer) customer1).addItem(book1);
        ((Customer) customer1).addItem(book2);
        ((Customer) customer1).addItem(electronicBook1);
        ((Customer) customer1).addItem(electronicBook2);
        ((Customer) customer1).completeOrder();

        ((Customer) customer2).basket.clear();
        ((Customer) customer2).addItem(stationary1);
        ((Customer) customer2).addItem(stationary2);
        ((Customer) customer2).addItem(book1);
        ((Customer) customer2).addItem(book2);
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


        booksOfGenre(EnumClasses.genre.Comedy);
        overX(20);
        allStockItems ();
        System.out.println("//////////////////ALL ORDERS//////////////////");
        System.out.println(Employee.orders.toString());
    }

    //Method to check to see which employees have sold over a set ammount 'X'
    public static void overX (int X){
        int count =1;
        for (Employee employee: employees) {
            //Cycle through each employee in array of all employees
            float total = employee.getTotalSales();
            if (total > X){
                if (count ==1)
                    System.out.println("The following customer have sold over £"+X+ ".00 worth of items:");
                count++;
                System.out.println(employee.toString());
            }
        }

    }

    //Method that returns all the books of a certain genre
    public static void booksOfGenre(EnumClasses.genre bookGenre){
        String bookInfo = null;
        System.out.println("//////////////////BOOKS OF GENRE :"+ bookGenre +"//////////////////");
        for (Book book : books) {
            //Cycle through each book in array of all books
            if (book.bookGenre==bookGenre){
                System.out.println(book.toString());
            }
        }
        System.out.println("//////////////////ELECTONIC BOOKS OF GENRE :"+ bookGenre +"//////////////////");
        for (ElectronicBook electronicBook : electronicBooks) {
            //Cycle through each book in array of all books
            if (electronicBook.bookGenre==bookGenre){
                System.out.println(electronicBook.toString());
            }

        }


    }

    //Method to calculate the total value of the stock items
    public static double valueOfStock (){
        double total = 0;
        for (Item item : items) {
            //Cycle through each item in array of all items and multiply quantity by price
            total+=item.quantity*item.price;
        }
        System.out.println("Total value of stock: £"+total);
        return total;
    }

    //Method to display all the items currently in stock
    public static void allStockItems (){
        double total = 0;
        System.out.println("//////////////////ALL STOCK ITEMS//////////////////");
        for (Item item : items) {
            //Cycle through each item in array of all items
            System.out.println(item.toString());
        }
    }

    //Method to calculate the total commission each employee is intilted to
    public static void commissionCalculator (){
        float total = 0;
        for (Employee employee : employees) {
            //Cycle through each employee in array of all employees
            employee.setBonus(0);
            total=employee.getTotalSales();
            /*Check to which boundary there total sales falls into
              Assign corresponding bonus value  */
            if (total>200)
                employee.setBonus(200);
            else if (total>100 && total<=200)
                employee.setBonus(100);
            else if (total>50 && total<=100)
                employee.setBonus(50);
        }
    }



}

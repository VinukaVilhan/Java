package Projects.library;

import java.util.Scanner;

class LibraryItem
{
    // properties
    public String title;
    public Integer ID;
    public Integer year;
    public Boolean available;

    // constructor
    public LibraryItem(String title, int ID, int year, boolean available)
    {
        this.title = title;
        this.ID = ID;
        this.year = year;
        this.available = available;
    }

    
    public void displayItemDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("ID: " + ID);
        System.out.println("Year: " + year);
        System.out.println("Available: " + available);
    }

    public double calculateFees(int lateDays)
    {
        return lateDays * 0.50;
    }
}

class Book extends LibraryItem{
    private final String isbn;
    public String author;

    // constructor
    public Book(String title, int ID, int year, boolean available, String author, String isbn)
    {
        // parent constructor
        super(title, ID, year, available);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public double calculateFees(int lateDays)
    {
        return lateDays * 0.75;
    }

    @Override
    public void displayItemDetails()
    {
        super.displayItemDetails();
        System.out.println("Author: "+ author);
        System.out.println("ISBN: "+ isbn);
    }
}

class Magazine extends LibraryItem{
    private final int issueNumber;

    // constructor
    public Magazine(String title, int ID, int year, boolean available, int issueNumber)
    {
        super(title, ID, year, available);
        this.issueNumber = issueNumber;
    }

    @Override
    public double calculateFees(int lateDays)
    {
        return lateDays * 0.25;
    }

    @Override
    public void displayItemDetails()
    {
        super.displayItemDetails();
        System.out.println("The issue number is "+ issueNumber);
    }

}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the LBMS!!!!!!!!!!!!");

        // creates library item objects
        Book book1 = new Book("Three Musketeers", 1000, 1920, true, "Alexander Dumas", "uio2908712");

        Magazine magazine1 = new Magazine("National Geography", 1002, 2012, false, 5000);

        // display details
        System.out.println("Display Book details\n");
        book1.displayItemDetails();

        System.out.println("Display Magazine details\n");
        magazine1.displayItemDetails();

        System.out.println("How many days late?");
        
        // initialize a new scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int lateDays = scanner.nextInt();
            
            System.out.println("\nLate fees for 5 days");
            System.out.println("Book late fee: "+ book1.calculateFees(lateDays));
            System.out.println("Magazine alte fee: "+ magazine1.calculateFees(lateDays));
        }
    }
}

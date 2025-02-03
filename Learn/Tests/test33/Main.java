import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Branch{
    public int BranchID;
    public String Location;
    public String Address;

    public Branch(int BranchID, String Location, String Address) {
        this.BranchID = BranchID;
        this.Location = Location;
        this.Address = Address;
    }
}

class BookStore{
    public List<Book> books;
    public List<Book> bestSellingBooks;

    public BookStore(){
        //initialize books and bestSellingBooks
        this.books = new ArrayList<>();
        this.bestSellingBooks = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        //add book to books
        this.books.add(book);
    }

    public void addBestSellingBook(Book book)
    {
        //add book to bestSellingBooks
        this.bestSellingBooks.add(book);
    }

    public void viewBooks()
    {
        for(Book book: books){
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Title: " + book.Title);
            System.out.println("Authors: ");
            for(String author: book.Authors){
                System.out.println(author);
            }
            System.out.println("Price: " + book.Price);
        }
    }

    public void viewBestSellingBooks()
    {
        for(Book bestSellingBook: bestSellingBooks){
            System.out.println("ISBN: " + bestSellingBook.ISBN);
            System.out.println("Title: " + bestSellingBook.Title);
            System.out.println("Authors: ");
           for(String author: bestSellingBook.Authors)
           {
                System.out.println(author);
           }
            System.out.println("Price: " + bestSellingBook.Price);
        }
    }
}

class Book {
    public String ISBN;
    public String Title;
    //authors
    public List<String> Authors;
    public float Price;
    public String Category;
    public Book(String ISBN, String Title, List<String> Authors, float Price, String Category) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Authors = Authors;
        this.Price = Price;
        this.Category = Category;
    }
}

class Customer{
    public int CustomerID;
    public String Name;

    public void viewBooks(BookStore bookStore)
    {
        bookStore.viewBooks();
    }
}

class RegisteredCustomer extends Customer{

    public RegisteredCustomer(int CustomerID, String Name) {
        this.CustomerID = CustomerID;
        this.Name = Name;
    }

    public void purchaseBook(Book book)
    {
        //purchase book
        System.out.println("Book purchased: " + book.Title);
        System.out.println("Price: " + book.Price);
    }
}

class StaffMember
{
    public int EmployeeID;
    public String Name;
    public Date DateOfBirth;

    public StaffMember(int EmployeeID, String Name, Date DateOfBirth) {
        this.EmployeeID = EmployeeID;
        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
    }

    // view books
    public void viewBooks(BookStore bookStore)
    {
        bookStore.viewBooks();
    }
}

class BranchManager extends StaffMember{

    public final String position = "Branch Manager";
    public String BranchName; 

    public BranchManager(int EmployeeID, String Name, Date DateOfBirth) {
        super(EmployeeID, Name, DateOfBirth);
    }

    public void editBookDetails(Book book, String ISBN, String Title, List<String> Authors, float Price, String Category)
    {
        //edit book details
        book.ISBN = ISBN;
        book.Title = Title;
        book.Authors = Authors;
        book.Price = Price;
        book.Category = Category;
    }
}


class Cashier extends StaffMember{

    public final String position = "Cashier";

    public Cashier(int EmployeeID, String Name, Date DateOfBirth) {
        super(EmployeeID, Name, DateOfBirth);
    }

    public void prepareBill(Book book)
    {
        //prepare bill
        System.out.println("Bill prepared for book: " + book.Title);
        System.out.println("Price: " + book.Price);

    }
}

class SalesAssistant extends StaffMember{

    public final String position = "Sales Assistant";

    public SalesAssistant(int EmployeeID, String Name, Date DateOfBirth) {
        super(EmployeeID, Name, DateOfBirth);
    }
}

public class Main {
    public static void main(String[] args)
    {

    }    
}

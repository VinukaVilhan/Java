package Learn.Tests.test5;

class Author
{
    public String name;
    private String nationality;

    // constructor
    Author(String name, String nationality)
    {
        this.name = name;
        this.nationality = nationality;
    }

    // default constructor
    Author(){}

    // display author
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);
    }

    // getters and setters
    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    // display message
    protected void displayMessage()
    {
        System.out.println("This is a protected method in Author class");
    }
}

public class Main {
    public static void main(String[] args)
    {
        // create a author object
        Author author1  = new Author("vinuka", "America");

        // display information about the first author
        author1.displayInfo();

        // modify the author details
        author1.setNationality("Sri Lanka");
        System.out.println("Updated Nationality: " + author1.getNationality());

        author1.displayMessage();

    }
}

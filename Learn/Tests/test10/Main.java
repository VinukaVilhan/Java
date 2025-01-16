package Learn.Tests.test10;

class Book{
    private String title;
    private String author;


    public Book setTitle(String title)
    {
        this.title = title;
        return this;
    }

    public Book setAuthor(String author)
    {
        this.author = author;
        return this;
    }

    public void printDetails(){
        System.out.println("Title: "+ title+ ", Author: "+ author);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Book bk1 = new Book();
        bk1.setTitle("title").setAuthor("author").printDetails();
    }
}

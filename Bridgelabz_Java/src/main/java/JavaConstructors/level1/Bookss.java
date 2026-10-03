import java.util.*;

class Booksss{
    private String title;
    private String author;
    private double price;
    
    public Booksss(){
        this("Unknown","Unknown",0.0);
    }
    public Booksss(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price : Rs. %.2f%n", price);
    }
}
public class Bookss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Book title");
        String bookName = sc.nextLine();

        System.out.println("Enter the Author name");
        String authorName = sc.nextLine();

        System.out.println("Enter the price");
        double price = sc.nextDouble();

        Booksss book = new Booksss();
        Booksss book1 = new Booksss(bookName,authorName,price);

        System.out.println("Book with Non-Parameterised constructor");
        book.display();
        System.out.println("Book display with parameterised constructor");
        book1.display();

        sc.close();
    }
}

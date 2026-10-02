import java.util.*;

class Books{
    private String title;
    private String author;
    private double price;
    private boolean isAvaliable;

    public Books(){
        this("Unknown","Unknown",0.0);
    }
    public Books(String title,String author,double price){
        this(title,author,price,true);
    }
    public Books(String title,String author,double price,boolean isAvaliable){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvaliable = isAvaliable;
    }
    public boolean borrowbook(){
        if(!isAvaliable){
            System.out.println("Book is not avaliable for borrowing");
            return false;
        }
        isAvaliable = false;
        return true;
    }
    public boolean returnbook(){
        if(isAvaliable){
            System.out.println("Book is already avaliable in library");
            return false;
        }
        isAvaliable = true;
        return true;
    }
    public void display(){
        System.out.println("Title :" + title);
        System.out.println("Author:" + author);
        System.out.printf("Price : Rs. %.2f%n", price);
        System.out.println("Avaliable for borrowing : " + (isAvaliable ? "Yes" : "No"));
    }

}
public class LibrarySystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book title");
        String bookName = sc.nextLine();

        System.out.println("Enter the Author name");
        String authorName = sc.nextLine();

        System.out.println("Enter the price");
        double price = sc.nextDouble();

        Books book = new Books(bookName,authorName,price);

        book.display();

        System.out.println("\nFirst borrow attempt:");
        System.out.println(book.borrowbook() ? "Book borrowed successfully." : "Sorry, book is not available.");

        System.out.println("\nSecond borrow attempt:");
        System.out.println(book.borrowbook() ? "Book borrowed successfully." : "Sorry, book is not available.");

        System.out.println("\nCurrent status:");
        book.display();

        System.out.println("\nReturning the book:");
        System.out.println(book.returnbook() ? "Book returned." : "This book was not borrowed.");
    }
}

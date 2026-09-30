
import java.util.Scanner;

/*
 * Program to Handle Book Details
 *
 * Problem Statement:
 * Create a Book class with attributes title, author, and price.
 * Add a method to display the book details.
 *
 * The program:
 * 1. Creates a Book class.
 * 2. Defines title, author, and price as attributes.
 * 3. Creates a method to display the book details.
 * 4. Takes book details as input.
 * 5. Displays the entered book details.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Book{
    String title;
    String author;
    double price;

    public void display(){
        System.out.println("Book Name is: " + title);
        System.out.println("Author Name is: " + author);
        System.out.println("Book price is: " + price);
    }

}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("enter the book title");
        book.title = sc.next();

        System.out.println("Enter the Author's Name");
        book.author = sc.next();

        System.out.println("Enter the Book price");
        book.price = sc.nextDouble();

        System.out.println("Book details are: ");
        book.display();

        sc.close();
    }
}

import java.util.*;

/*
 * Program to Demonstrate Library Management System
 *
 * Problem Statement:
 * Create a Book class with the following features:
 * 1. Use a static variable libraryName shared across all books.
 * 2. Use a static method displayLibraryName() to print the library name.
 * 3. Use this keyword to initialize title, author, and isbn.
 * 4. Use a final variable isbn so that it cannot be changed.
 * 5. Use instanceof to check whether an object is a Book.
 *
 * The program:
 * 1. Creates a Book class.
 * 2. Defines libraryName as a static variable.
 * 3. Defines title and author as private instance variables.
 * 4. Defines isbn as a private final variable.
 * 5. Uses this keyword in the constructor.
 * 6. Creates a static method to display the library name.
 * 7. Creates a method to display book details.
 * 8. Uses instanceof before displaying the book details.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Book_Details{
    private final String isbn;
    private String title;
    private String author;
    static String libraryName = "Bridgelabz_library";

    public Book_Details(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    static void displayLibraryName(){
        System.out.println("Library Name is : " + libraryName);
    }
    public void display(){
        System.out.println("Book ISBN is : " + isbn);
        System.out.println("Book Title is : " + title);
        System.out.println("Book Author is : " + author);
    }
}
public class LibraryManagement{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Book ISBN");
        String isbn = sc.nextLine();

        System.out.println("Enter the Book Title");
        String title = sc.nextLine();

        System.out.println("Enter the Book Author");
        String author = sc.nextLine();

        Book_Details book = new Book_Details(isbn,title,author);
        if(book instanceof Book_Details){
            book.display();
            Book_Details.displayLibraryName();
        }
        sc.close();
    }
}

import java.util.*;

class Books{
    private String title;
    private String author;

    public Books(String title,String author){
        this.title = title;
        this.author = author;
    }
    public void display(){
        System.out.println("The title of Book is : " + title);
        System.out.println("The author of the Book is : " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Books> books;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Books book){
        books.add(book);
    }
    public void display(){
        System.out.println("Library Name is : " + name);
        for(Books book : books){
            book.display();
            System.out.println();
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {

        Books book1 = new Books("Wings of fire","Ron");
        Books book2 = new Books("Harry Potter","J.K Rowling");

        Library library1 = new Library("Central Library");
        Library library2 = new Library("College Library");

        library1.addBook(book1);
        library2.addBook(book2);

        library1.display();
        library2.display();
    }
}

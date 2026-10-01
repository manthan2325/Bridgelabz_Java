import java.util.*;

class Book{
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN,String title,String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public boolean setAuthor(String newAuthor){
        if(newAuthor.isEmpty()){
            System.out.println("Not the Valid Author");
            return false;
        }
        this.author = newAuthor;
        return true;
    }
    public void display(){
        System.out.println("the Book code is : " + ISBN);
        System.out.println("the Book title is : " + title);
        System.out.println("the Book author is : " + author);
    }
}
class EBook extends Book {
    private double fileSizeMB;

    public EBook() {
        this("Unknown", "Unknown", "Unknown", 0.0);
    }

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB < 0 ? 0.0 : fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    // Uses the public and protected members directly
    public void showAccessDemo() {
        System.out.println("Public    -> ISBN  : " + ISBN);        // public: accessible
        System.out.println("Protected -> Title : " + title);       // protected: accessible in subclass
        System.out.println("Private   -> Author: " + getAuthor()); // private: only via getter
        // System.out.println(author);   // compile error: author has private access in Book
    }

    // Subclass can modify the protected field directly
    public void updateTitle(String newTitle) {
        if (newTitle != null && !newTitle.trim().isEmpty()) {
            title = newTitle.trim();
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Size  : %.1f MB%n", fileSizeMB);
    }
}
public class Library {
    public static void main(String[] args) {
        Book book = new Book("978-0-13-468599-1", "Effective Java", "Joshua Bloch");
        EBook ebook = new EBook("978-1-49-195202-3", "Clean Code", "Robert Martin", 4.5);

        System.out.println("--- Book ---");
        book.display();

        System.out.println("\n--- EBook ---");
        ebook.display();

        System.out.println("\n--- Access demo inside subclass ---");
        ebook.showAccessDemo();

        System.out.println("\n--- Modifying members ---");
        System.out.println("Set author to \"\"              : "
                + (ebook.setAuthor("") ? "accepted" : "rejected"));
        System.out.println("Set author to \"Robert C. Martin\": "
                + (ebook.setAuthor("Robert C. Martin") ? "accepted" : "rejected"));
        ebook.updateTitle("Clean Code (2nd Ed)");
        ebook.display();
    }
}

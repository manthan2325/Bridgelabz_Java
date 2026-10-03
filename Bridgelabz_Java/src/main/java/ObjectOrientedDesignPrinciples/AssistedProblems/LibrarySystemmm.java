import java.util.*;

class Boooks{
    private String title;
    private String author;

    public Boooks(String title,String author){
        this.title = title;
        this.author = author;
    }
    public void display(){
        System.out.println("The title of Book is : " + title);
        System.out.println("The author of the Book is : " + author);
    }
}

class Libraryyy {
    private String name;
    private ArrayList<Boooks> books;

    public Libraryyy(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Boooks book){
        books.add(book);
    }
    public void display(){
        System.out.println("Library Name is : " + name);
        for(Boooks book : books){
            book.display();
            System.out.println();
        }
    }
}
public class LibrarySystemmm {
    public static void main(String[] args) {

        Boooks book1 = new Boooks("Wings of fire","Ron");
        Boooks book2 = new Boooks("Harry Potter","J.K Rowling");

        Libraryyy library1 = new Libraryyy("Central Library");
        Libraryyy library2 = new Libraryyy("College Library");

        library1.addBook(book1);
        library2.addBook(book2);

        library1.display();
        library2.display();
    }
}

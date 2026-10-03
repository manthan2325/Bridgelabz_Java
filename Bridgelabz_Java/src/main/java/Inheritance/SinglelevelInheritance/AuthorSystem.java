import java.time.Year;
import java.util.*;

class Bookkk{
    protected String title;
    protected int publicationYear;

    public Bookkk(String title,int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void display(){
        System.out.println("Book title is : " + title);
        System.out.println("Book Publication Year is : " + publicationYear);
    }
}
class Author extends Bookkk{
    protected String name;
    protected String bio;

    public Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void display(){
        System.out.println("Book title is : " + title);
        System.out.println("Book publication year is : " + publicationYear);
        System.out.println("Author name is : " + name);
        System.out.println("Author Bio is : " + bio);
        System.out.println("");
    }
}
public class AuthorSystem {
    public static void main(String[] args) {
        Author author = new Author(
            "The Alchemist",
            1988,
            "Paulo Coelho",
            "Brazilian author known for philosophical novels."
        );

        author.display();
    }
}

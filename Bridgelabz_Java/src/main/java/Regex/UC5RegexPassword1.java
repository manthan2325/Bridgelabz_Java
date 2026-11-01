import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface PasswordValidator{
    boolean isValid(String text);
}
public class UC5RegexPassword1 {
    public static void main(String[] args) {
        String regex = "^.{8,}$";
    PasswordValidator minlength = text -> {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(text);
        return matcher.matches();
    };
    Scanner sc = new Scanner(System.in);
    String password = sc.next();
    System.out.println(minlength.isValid(password) ? "Valid Password" : "Not Valid Password");
    sc.close();
    }
}


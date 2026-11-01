import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


interface SpecialValidation{
    boolean isValid(String text);
}
public class UC8SpecialCharacter {
    public static void main(String[] args) {
        String regex = "^.*[+\\-%_#].*$";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SpecialValidation d = text-> {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            return matcher.matches();
        };
        System.out.println(d.isValid(s));
    }
}

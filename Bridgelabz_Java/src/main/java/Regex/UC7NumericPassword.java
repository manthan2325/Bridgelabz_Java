
import java.util.Scanner;
import java.util.regex.*;

interface Validation{
    boolean isValid(String text);
}

public class UC7NumericPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String regex = "^.*[0-9].*$";

        Validation vc = s -> {
             Pattern pattern = Pattern.compile(regex);
             Matcher matcher = pattern.matcher(s);
             return matcher.matches();
        };
        System.out.println(vc.isValid(text));
    }
}



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//manthanhanchate123@gmail.com
public class UC3Email {
    public static boolean isValid(String email){
        String regex = "^[a-zA-Z0-9_+-]+(\\.[a-zA-Z0-9_+-]+)*@" + "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\." + "[a-zA-Z]{3,}$";
        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        if(isValid(email)){
            System.out.println("Valid mail");
        }else{
            System.out.println("Not a Valid mail");
        }
        sc.close();
    }
}

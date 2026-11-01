

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//manthanhanchate123@gmail.com
public class UC1FirstName {
    public static boolean isValid(String name){
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(name);
        return matcher.matches();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstname = sc.next();

        if(isValid(firstname)){
            System.out.println("Valid Name");
        }else{
            System.out.println("Not a Valid Name");
        }
        sc.close();
    }
}

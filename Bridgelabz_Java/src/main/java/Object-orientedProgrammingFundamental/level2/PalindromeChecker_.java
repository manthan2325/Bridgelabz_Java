import java.util.*;

/*
 * Program to Check Palindrome String
 *
 * Problem Statement:
 * Create a PalindromeChecker class with an attribute text.
 * Add methods to:
 * 1. Check if the text is a palindrome.
 * 2. Display the result.
 *
 * The program:
 * 1. Creates a PalindromeChecker class.
 * 2. Defines text as an attribute.
 * 3. Creates a method to check whether the text is a palindrome.
 * 4. Creates a method to display the result.
 * 5. Takes the text as input.
 * 6. Displays whether the text is a palindrome or not.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Palindrome{
    private String text;
    public Palindrome(String text){
        this.text = text;
    }
    public boolean ispalindrome(){
        int left = 0;
        int right = text.length()-1;
        while(left < right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void display(){
        System.out.println("the text is: " + text);
        if(ispalindrome()){
            System.out.println("The text is Palindrome");
        }else{
            System.out.println("The text is not Palindrome");
        }
    }

}
public class PalindromeChecker_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Palindrome pd = new Palindrome(s);

        pd.display();
        sc.close();
    }
}

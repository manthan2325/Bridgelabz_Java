import java.util.*;
/*
 * Problem 18 - GCR Methods Level 1
 *
 * Program to find the number of vowels and consonants present in a
 * given String and display their counts.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Checks each character to determine whether it is a vowel,
 *    consonant, or not a letter.
 * 3. Converts uppercase letters to lowercase using ASCII values.
 * 4. Uses charAt() to check every character in the String.
 * 5. Counts the total number of vowels and consonants.
 * 6. Returns the vowel and consonant counts in an integer array.
 *
 * Hint =>
 * 1. Create a method to check whether a character is a vowel,
 *    consonant, or not a letter.
 * 2. Convert uppercase characters to lowercase using ASCII values.
 * 3. Create a method to find vowels and consonants using charAt()
 *    and return their counts in an array.
 * 4. Display the total number of vowels and consonants.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */
public class VowelsConsonant {
    // Method to check whether a character is a vowel, consonant or not a letter
    public static String check(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch + 32);
        }
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            return "Vowels";
        }
        if(ch >= 'a'&& ch <= 'z'){
            return "Consonant";
        }
        return "Not a letter";
    }
    // Method to find the count of vowels and consonants
    public static int[] findvc(String text){
        int n = text.length();
        int vowels  = 0;
        int consonants = 0;
        for(int i=0;i<n;i++){
            char ch = text.charAt(i);
            String result = check(ch);
            if(result.equals("Vowels")){
                vowels++;
            }else if(result.equals("Consonant")){
                consonants++;
            }
        }
        return new int[]{vowels,consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find vowel and consonant counts
        int[] result = findvc(text);

        System.out.println("\nNumber of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        sc.close();
    }
}

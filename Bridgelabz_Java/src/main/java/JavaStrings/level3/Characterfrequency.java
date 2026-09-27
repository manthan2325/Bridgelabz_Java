/*
 * Problem 27 - GCR Methods Level 1
 *
 * Program to find the frequency of each character in a String
 * using the charAt() method and display the result.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Creates an integer array of size 256 to store the frequency
 *    of each ASCII character.
 * 3. Uses charAt() to access each character in the String.
 * 4. Counts the frequency of each character.
 * 5. Creates a 2D array to store the characters and their frequencies.
 * 6. Displays each character along with its frequency.
 *
 * Hint =>
 * 1. Create a method to find the frequency of characters in a String
 *    using the charAt() method.
 * 2. Use an integer array of size 256 to store character frequencies.
 * 3. Use the ASCII value of each character as the array index.
 * 4. Loop through the String to find the frequency of each character.
 * 5. Create a 2D array to store the characters and their frequencies.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Characterfrequency {
    public static String[][] func(String s){
        int n = s.length();
        int[] freqc = new int[256];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freqc[c]++;
        }
        String[][] temp = new String[n][2];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(freqc[c] == 1){
                temp[i][0] = String.valueOf(c);
                temp[i][1] = String.valueOf(freqc[c]);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] freq = func(s);
        for(int i=0;i<freq.length;i++){
            System.out.println("character is: " + freq[i][0]);
            System.out.println("frequency is: " + freq[i][1]);
        }        
        sc.close();
    }
}

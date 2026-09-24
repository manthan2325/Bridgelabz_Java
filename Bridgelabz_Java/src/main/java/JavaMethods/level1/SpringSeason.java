
import java.util.Scanner;

/*
 * Problem 1 - GCR Methods Level 1
 * Write a program SpringSeason that takes two int values month and day
 * from the command line and prints "Its a Spring Season" otherwise
 * prints "Not a Spring Season".
 *
 * Hint =>
 * Spring Season is from March 20 to June 20.
 * Write a method to check whether the given month and day fall within
 * the Spring Season.
 * The method should return true if it is Spring Season.
 * Otherwise, the method should return false.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class SpringSeason {

    // Method to check whether the given date falls in Spring Season
    static boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take month and day from command-line arguments
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Call the method to check for Spring Season
        boolean result = isSpringSeason(month, day);

        // Display the result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
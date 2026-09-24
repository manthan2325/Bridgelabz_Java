/*
Problem - Youngest and Tallest Friend
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony
based on their ages and the tallest among the friends based on their heights.

Hint =>

1. Take user input for age and height for the 3 friends and store it in two arrays
each to store the values for age and height of the 3 friends
2. Loop through the array and find the youngest of the 3 friends and the tallest
of the 3 friends
3. Finally display the youngest and tallest of the 3 friends

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.ArrayList; // Import ArrayList.
import java.util.Scanner; // Import Scanner.

public class YoungestTallestFriends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create Scanner object.

        ArrayList<String> names = new ArrayList<>(); // Store names.
        ArrayList<Integer> ages = new ArrayList<>(); // Store ages.
        ArrayList<Double> heights = new ArrayList<>(); // Store heights.

        // Add the names of the three friends.
        names.add("Amar");
        names.add("Akbar");
        names.add("Anthony");

        // Take age and height input for each friend.
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names.get(i) + ": "); // Ask for age.
            int age = input.nextInt(); // Read age.
            ages.add(age); // Store age.

            System.out.print("Enter height of " + names.get(i) + " in cm: "); // Ask for height.
            double height = input.nextDouble(); // Read height.
            heights.add(height); // Store height.
        }

        // Assume the first friend is the youngest and tallest.
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the ArrayLists.
        for (int i = 1; i < 3; i++) {

            // Find the youngest friend.
            if (ages.get(i) < ages.get(youngestIndex)) {
                youngestIndex = i;
            }

            // Find the tallest friend.
            if (heights.get(i) > heights.get(tallestIndex)) {
                tallestIndex = i;
            }
        }

        // Display the youngest friend.
        System.out.println("The youngest friend is " + names.get(youngestIndex)
                + " with age " + ages.get(youngestIndex));

        // Display the tallest friend.
        System.out.println("The tallest friend is " + names.get(tallestIndex)
                + " with height " + heights.get(tallestIndex) + " cm");

        input.close(); // Close Scanner.
    }
}
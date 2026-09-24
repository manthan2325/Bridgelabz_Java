/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number

Author: Asher Mustafa
Date: 24-09-2026
*/
import java.util.*;
public class Rewordprogram2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (index != s.length()) {

            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                
                // lets see Arrays.copyOf() method
                // The Arrays.copyOf() method is a built-in method in the java.util.Arrays class that allows you to create a new array by copying elements from an existing array. It takes two parameters: the original array and the new length of the array. It returns a new array containing the copied elements. Here's an example of how to use it:
                // int[] originalArray = {1, 2, 3, 4, 5};
                // int newLength = 10;
                // int[] newArray = Arrays.copyOf(originalArray, newLength);
                // In this example, newArray will contain the elements {1, 2, 3, 4, 5, 0, 0, 0, 0, 0}, with the remaining elements initialized to their default value (0 for int).
                // so if we wanted to use this here then we would do it like this
                int [] temp = Arrays.copyOf(digits, maxDigit);
                // we could have also have first made a temp for the maxdigit ran a loop to store the and restored it in the digits
                digits = temp;
                // will our code work as it is now?
                // 
                
            }
            int number = Character.getNumericValue(s.charAt(index));
            digits[index] = number % 10;
            index++;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        

    }
}

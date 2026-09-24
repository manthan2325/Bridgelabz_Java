/*
Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number

*/
import java.util.*;
public class LargestAndSecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i =0 ;i<10;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println("Largest number: "+arr.get(arr.size()-1));
        System.out.println("Second largest number: "+arr.get(arr.size()-2));
        // what is collections.sort() method?
        // Collections.sort() is a method in the Collections class that sorts the elements of a list in ascending order.
        // do we not need to import this collection class?
        // Yes, we need to import the Collections class to use the sort() method. In this code, we have imported the entire java.util package, which includes the Collections class. Therefore, we can use the sort() method without any issues.
        // is the collections.sort() method present in the java.io.* package?
        // No, the collections.sort() method is not present in the java.io.* package. It is present in the java.util.* package.
        // say if i wanted to write this code without the sort then how would i do it?
        // If you want to find the largest and second largest numbers without using Collections.sort(), you can iterate through the list and keep track of the largest and second largest numbers. Here's how you can do it:
       /*
       int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > largest) {
                secondLargest = largest;
                largest = arr.get(i);
            } else if (arr.get(i) > secondLargest && arr.get(i) != largest) {
                secondLargest = arr.get(i);
            }
        }
      
        */
    }
}
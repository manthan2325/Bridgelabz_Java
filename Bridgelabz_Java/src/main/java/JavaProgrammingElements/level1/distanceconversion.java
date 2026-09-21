package JavaProgrammingElements.level2;
import java.util.*;

public class distanceconversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float distance_in_feets = sc.nextInt();
        float distance_in_yard = distance_in_feets / 3;
        float distance_in_miles = distance_in_yard / 1760;  
        System.out.println("Distance in yards: " + distance_in_yard);
        System.out.println("Distance in miles: " + distance_in_miles);
    }
}
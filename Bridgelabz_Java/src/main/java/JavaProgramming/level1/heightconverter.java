package JavaProgrammingElements.level2;
import java.util.*;

public class heightconverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float height_in_cm = sc.nextInt();
        float height_in_inch = height_in_cm / 2.54f;
        float height_in_foot = height_in_inch / 12f; 
        System.out.println("Height in inches: " + height_in_inch);
        System.out.println("Height in feet: " + height_in_foot);
    }
}
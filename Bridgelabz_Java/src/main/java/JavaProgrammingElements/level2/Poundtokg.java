package JavaProgrammingElements.level3;
import java.util.*;

public class Poundtokg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pound = sc.nextFloat();
        float kg = pound / 2.2f;
        System.out.println("The " + pound + " pounds is " + kg + " kilograms\n");
    }
}

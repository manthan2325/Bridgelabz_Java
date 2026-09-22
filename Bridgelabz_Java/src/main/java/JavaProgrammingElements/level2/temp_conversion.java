import java.util.*;

public class temp_conversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float temp_in_celsius = sc.nextFloat();
        float temp_in_fahrenheit = (temp_in_celsius * 9/5) + 32;
        System.out.println("The " + temp_in_celsius + " celsius is " + temp_in_fahrenheit + " fahrenheit\n");
    }
}
import java.util.*;

public class temp_conversion_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float temp_in_fahrenheit = sc.nextFloat();
        float temp_in_celsius = (temp_in_fahrenheit - 32) * 5/9;
        System.out.println("The " + temp_in_fahrenheit + " fahrenheit is " + temp_in_celsius + " celsius\n");
    }
}
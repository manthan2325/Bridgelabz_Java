package JavaProgrammingElements.level3;
import java.util.*;

public class Chocolate_distribution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_chocolates = sc.nextInt();
        int total_students = sc.nextInt();
        int chocolates_per_student = total_chocolates / total_students;
        int remaining_chocolates = total_chocolates % total_students;
        System.out.println("The number of chocolates each student will get is " + chocolates_per_student + " and the remaining chocolates are " + remaining_chocolates + "\n");
    }
}
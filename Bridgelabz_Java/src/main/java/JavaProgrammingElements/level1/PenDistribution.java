package JavaProgrammingElements.level2;
import java.util.*;

public class PenDistribution{
    public static void main(String[] args){
        int no_of_students = 3;
        int no_of_pens = 14;
        int a = no_of_pens % no_of_students;
        int b = no_of_pens / no_of_students;
        System.out.println("Each student will get " + b + " pens and " + a + " pens will be left over.");
    }
}
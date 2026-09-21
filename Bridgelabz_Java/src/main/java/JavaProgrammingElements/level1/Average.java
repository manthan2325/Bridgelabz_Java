package JavaProgrammingElements.level2;
import java.util.*;

public class Average{
    public static void main(String[] args){
        System.out.println("Maths's Marks");
        int maths_marks = 94;
        System.out.println("Physics's Marks");
        int Physics_marks = 95;
        System.out.println("Chemistry's Marks");
        int Chemistry_marks = 96;
        int avg = (maths_marks + Physics_marks + Chemistry_marks) / 3;
        System.out.println("Average Marks is:" + avg);
    }
}
import java.util.Scanner;

/*
 * Program to Simulate Student Report
 *
 * Problem Statement:
 * Create a Student class with attributes name, rollNumber, and marks.
 * Add two methods:
 * 1. To calculate the grade based on the marks.
 * 2. To display the student's details and grade.
 *
 * The program:
 * 1. Creates a Student class.
 * 2. Defines name, rollNumber, and marks as attributes.
 * 3. Creates a method to calculate the grade.
 * 4. Creates a method to display the student details and grade.
 * 5. Takes student details as input.
 * 6. Displays the complete student report.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Student{
    String name;
    String rollno;
    int marks;

    public String grade(){
        String g = "";
        if(marks > 90){
            g = "A";
        }else if(marks >= 80 && marks <= 90){
            g = "B";
        }else if(marks >= 70 && marks <= 80){
            g = "C";
        }else{
            g = "D";
        }
        return g;
    }
    public void display(String s){
        System.out.println("Student name is " + name);
        System.out.println("Student rollno is " + rollno);
        System.out.println("Student marks is " + marks);
        System.out.println("Student grade is " + s);
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the Name");
        student.name = sc.next();

        System.out.println("Enter the rollno");
        student.rollno = sc.next();

        System.out.println("Enter the marks");
        student.marks = sc.nextInt();

        String s = student.grade();

        System.out.println("Student details are: ");
        student.display(s);

        sc.close();

    }
}

import java.util.*;

/*
 * Program to Demonstrate University Student Management
 *
 * Problem Statement:
 * Create a Student class with the following features:
 * 1. Use a static variable universityName shared across all students.
 * 2. Use a static method displayTotalStudents() to show the number
 *    of students enrolled.
 * 3. Use this keyword in the constructor to initialize name,
 *    rollNumber, and grade.
 * 4. Use a final variable rollNumber so that it cannot be changed.
 * 5. Use instanceof to check whether an object is a Student before
 *    displaying details or updating the grade.
 *
 * The program:
 * 1. Creates a Student class.
 * 2. Defines universityName as a static variable.
 * 3. Defines name and grade as private instance variables.
 * 4. Defines rollNumber as a private final variable.
 * 5. Uses this keyword in the constructor.
 * 6. Keeps track of the total number of students.
 * 7. Creates methods to display details and update the grade.
 * 8. Uses instanceof before performing operations on the object.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class University{
    private String name;
    private final int rollno;
    private String grade;
    static String universityName = "BridgeLabz";
    static int totalStudents;

    public University(String name,int rollno,String grade){
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
        totalStudents++;
    }
    static int displayTotalStudents(){
        return totalStudents;
    }
    public void updateGrade(String grade){
        this.grade = grade;
    }
    public void display(){
        System.out.println("The name is : " + name);
        System.out.println("The roll no is : " + rollno);
        System.out.println("The grade is : " + grade);
        System.out.println("The University Name is : " + universityName);
        System.out.println("The total no of Students are : " + displayTotalStudents());
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the Student Name");
        String name = sc.nextLine();

        System.out.println("Enter the Student rollno");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Grade");
        String grade = sc.nextLine();
        University s = new University(name,rollno,grade);
        if(s instanceof University){
            System.out.println("Student Details are : ");
            s.display();
        }

        System.out.println("Do you want to Upgrade the Grade ?");
        String ask = sc.nextLine();
        if(ask.equals("YES")){
            String mark = sc.nextLine();
            s.updateGrade(mark);
            s.display();
        }
        sc.close();
    }
}

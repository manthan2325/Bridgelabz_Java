import java.util.*;
/*
 * Program to Display Employee Details
 *
 * Problem Statement:
 * Create an Employee class with the attributes name, id and salary.
 * Add a method to display the employee details.
 *
 * The program:
 * 1. Creates an Employee class.
 * 2. Defines name, id and salary as attributes.
 * 3. Creates a method to display the employee details.
 * 4. Creates an Employee object and assigns values to it.
 * 5. Displays the employee details.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Employee{
    String name;
    String id;
    double Salary;

    public void display(){
        System.out.println("Employee name is: " + name);
        System.out.println("Employee id id: " + id);
        System.out.println("Salary is: " + Salary);
    }
}
public class Employeedetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter Employee Name: ");
        employee.name = sc.next();

        System.out.println("Enter Employee id: ");
        employee.id = sc.next();

        System.out.println("Enter the Salary: ");
        employee.Salary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        employee.display();

        sc.close();
        
    }  
};
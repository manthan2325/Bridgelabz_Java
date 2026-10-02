import java.util.*;
/*
 * Program to Demonstrate Employee Management System
 *
 * Problem Statement:
 * Create an Employee class with the following features:
 * 1. Use a static variable companyName shared by all employees.
 * 2. Use a static method displayTotalEmployees() to show the
 *    total number of employees.
 * 3. Use this keyword to initialize name, id, and designation
 *    in the constructor.
 * 4. Use a final variable id so that it cannot be modified
 *    after assignment.
 * 5. Use instanceof to check whether an object is an Employee
 *    before displaying its details.
 *
 * The program:
 * 1. Creates an Employee class.
 * 2. Defines companyName as a static variable.
 * 3. Defines name and designation as private instance variables.
 * 4. Defines id as a private final variable.
 * 5. Uses this keyword in the constructor.
 * 6. Keeps track of the total number of employees.
 * 7. Creates a method to display employee details.
 * 8. Uses instanceof before displaying employee details.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Employee{
    private String name; // Instance variable for employee name
    private final int id; // Final variable for employee ID, cannot be changed after assignment
    private String designation; // Instance variable for employee designation
    // Static variable shared by all Employee objects
    private static String companyName = "Bridgelabz_Company"; // Static variable for company name
    // Static variable for total no of Employees
    private static int totalEmployees = 0;

    /*
     * Constructor to initialize employee details.
     *
     * this.name refers to the instance variable.
     * name refers to the constructor parameter.
     */

    public Employee(String name,int id,String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public String getCompanyName(){
        return companyName;
    }
    static int getTotalEmployees(){
        return totalEmployees;
    }
    public void display(){
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee ID is : " + id);
        System.out.println("Employee Designation is : " + designation);
        System.out.println("Company Name is : " +  companyName);
    }
}
public class EmployeeManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee Name");
        String name = sc.nextLine();

        System.out.println("Enter the Employee ID");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Employee Designation");
        String designation = sc.nextLine();

        /*
         * Create an Employee object using the parameterized constructor.
         */

        Employee employee = new Employee(name,id,designation);
        if(employee instanceof Employee){
            employee.display();
        }
        System.out.println("Total Employees in " + employee.getCompanyName() + " is : " + Employee.getTotalEmployees());
        sc.close();
    }
}

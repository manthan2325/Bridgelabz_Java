/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

Date: 4 oct
*/

interface Department { // interface
    void assignDepartment(String department);
}

abstract class Employee {
    int employeeId;
    String name;
    private double employeeSalary;

    Employee(int id, String name, double salary) {
        employeeId = id;
        this.name = name;
        employeeSalary = salary;
    }

    public double getSalary() {
        return employeeSalary;
    }

    abstract void calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee implements Department {
    String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        System.out.println("Salary: " + getSalary()); // private var,so getter function
    }

    public void assignDepartment(String department) {
        this.department = department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    int hours;
    double rate;
    String department;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        System.out.println("Salary: " + (hours * rate));
    }

    public void assignDepartment(String department) {
        this.department = department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Dheeraj", 50000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 40, 500);

        e1.displayDetails();
        e1.calculateSalary();

        System.out.println();

        e2.displayDetails();
        e2.calculateSalary();
    }
}
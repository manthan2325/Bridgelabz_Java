import java.util.*;

class Employee_a{
    protected String name;
    protected String id;
    protected int salary;

    public Employee_a(String name,String id,int salary){
        this.name = name;
        this.id = id;
        this.salary  = salary;
    }
    public void display(){
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee Salary is : " + salary);
    }
}

class Manager_a extends Employee_a{
    private int teamSize;
    public Manager_a(String name,String id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }
    @Override
    public void display(){
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee Salary is : " + salary);
        System.out.println("Team Size is : " + teamSize);
    }
}
class Developer extends Employee_a{
    private String programmingLanguage;

    public Developer(String name,String id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void display(){
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee Salary is : " + salary);
        System.out.println("The Programming Language is : " + programmingLanguage);
    }
}
class Intern extends Employee_a {
    private int duration;

    public Intern(
        String name,
        String id,
        int salary,
        int duration
    ) {
        super(name,id,salary);
        this.duration = duration;
    }

    @Override
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println(
            "Internship Duration : " +
            duration + " months"
        );
    }
}
public class EmployeeInheritance {
    public static void main(String[] args) {
         Manager_a manager =
            new Manager_a("Rahul", "101", 90000, 10);

        Developer developer =
            new Developer("Chaitanya", "102", 70000, "Java");

        Intern intern =
            new Intern("Priya", "103", 20000, 6);

        manager.display();

        System.out.println();

        developer.display();

        System.out.println();

        intern.display();
    }
}

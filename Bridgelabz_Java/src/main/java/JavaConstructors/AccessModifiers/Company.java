import java.util.*;

class Employee {
    public final String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean setSalary(double newSalary) {
        if (newSalary <= 0) {
            System.out.println("Not the Valid Salary");
            return false;
        }
        this.salary = newSalary;
        return true;
    }

    public void display() {
        System.out.println("the Employee ID is : " + employeeID);
        System.out.println("the Department is : " + department);
        System.out.println("the Salary is : " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // public and protected can be used directly, private needs the getter
    public void showAccess() {
        System.out.println("Public    -> ID : " + employeeID);
        System.out.println("Protected -> Department : " + department);
        System.out.println("Private   -> Salary : " + getSalary());
        // System.out.println(salary);   // error: salary is private in Employee
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment.isEmpty()) {
            System.out.println("Not the Valid Department");
            return;
        }
        department = newDepartment;   // protected, so the subclass can change it directly
    }

    public void addBonus(double bonus) {
        setSalary(getSalary() + bonus);   // salary is private, so go through the setter
    }

    @Override
    public void display() {
        super.display();
        System.out.println("the Team size is : " + teamSize);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee("E101", "Finance", 40000);
        Manager mgr = new Manager("M201", "Engineering", 80000, 8);

        System.out.println("--- Employee ---");
        emp.display();

        System.out.println("\n--- Manager ---");
        mgr.display();

        System.out.println("\n--- Access inside Manager ---");
        mgr.showAccess();

        System.out.println("\n--- Changing values ---");
        mgr.setSalary(-100);
        mgr.setSalary(90000);
        mgr.changeDepartment("Operations");
        mgr.addBonus(5000);
        mgr.display();
    }
}
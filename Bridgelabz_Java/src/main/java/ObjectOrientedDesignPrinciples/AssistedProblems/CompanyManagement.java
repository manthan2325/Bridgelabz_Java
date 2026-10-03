import java.util.*;

class Employees{
    private String name;

    public Employees(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("The Employee Name is : " + name);
    }
}

class Departments{
    private String name;
    private ArrayList<Employees> departments;

    public Departments(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addEmployee(Employees employee){
        departments.add(employee);
    }   
    public void display(){
        System.out.println("The name of Department is : " + name);
        for(Employees employee : departments){
            employee.display();
        }
    }
}

class Company{
    private String name;
    private ArrayList<Departments> companies;

    public Company(String name){
        this.name = name;
        this.companies = new ArrayList<>();
    }
    public void createDepartment(Departments department){
        companies.add(department);
    }
    public void display(){
        System.out.println("Company Name is : " + name);
        for(Departments dept : companies){
            System.out.println("Department name is : " + dept);
        }
    }
}
public class CompanyManagement {
    public static void main(String[] args) {
        
    }
}

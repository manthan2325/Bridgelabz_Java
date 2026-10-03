import java.util.*;

class Departmentss{
    private String name;
    private ArrayList<Faculty> faculties;

    public Departmentss(String name){
        this.name = name;
        this.faculties = new ArrayList<>();
    }
    public String getDepartmentName(){
        return name;
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    public void display(){
        System.out.println("Department Name is : " +  name);
        for(Faculty faculty : faculties){
            System.out.println("Faculty Name is : " + faculty.getName());
        }
    }
}
class Faculty{
    private String name;

    public Faculty(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Faculty Name is : " + name);

    }
}

class University{
    private String name;
    private ArrayList<Departmentss> departments;

    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }
    // Communication relationship is shown over here
    public Departmentss createDepartment(String Deptname){
        Departmentss department = new Departmentss(Deptname);
        departments.add(department);
        return department; 
    }
    public void display(){
        System.out.println("University Name is : " + name);
        for(Departmentss dept : departments){
            System.out.println(" " + dept.getDepartmentName());
        }
    }
}
public class UniversityManagement {
    public static void main(String[] args) {

        University uv = new University("SRM");

        Departmentss d1 = uv.createDepartment("CSE");
        Departmentss d2 = uv.createDepartment("ECE");

        Faculty f1 = new Faculty("Manthan");
        Faculty f2 = new Faculty("Rohan");
        Faculty f3 = new Faculty("Aditya");

        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d1.addFaculty(f3);

        d2.addFaculty(f1);
        d2.addFaculty(f2);
        d2.addFaculty(f3);

        uv.display();
        System.out.println("Faculty inside department A names are : ");
        d1.display();
        System.out.println("Faculty inside department B names are : ");
        d2.display();
    }
}

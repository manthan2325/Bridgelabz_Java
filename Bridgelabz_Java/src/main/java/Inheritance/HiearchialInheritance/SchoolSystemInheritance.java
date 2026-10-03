import java.util.*;


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("I am a person.");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Students extends Person {
    private String grade;

    public Students(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystemInheritance {
    public static void main(String[] args) {

        Teacher teacher =
                new Teacher("Rahul", 35, "Mathematics");

        Students student =
                new Students("Chaitanya", 20, "A");

        Staff staff =
                new Staff("Ramesh", 40, "Administration");

        teacher.displayRole();

        System.out.println();

        student.displayRole();

        System.out.println();

        staff.displayRole();
    }
}
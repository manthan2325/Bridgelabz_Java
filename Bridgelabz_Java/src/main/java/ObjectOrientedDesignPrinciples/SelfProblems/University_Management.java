import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Coursee> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association + Communication
    public void enrollCourse(Coursee course) {
        courses.add(course);
        course.addStudent(this);

        System.out.println(
            name + " enrolled in " +
            course.getCourseName()
        );
    }

    public void displayCourses() {
        System.out.println("Courses of " + name + ":");

        for (Coursee course : courses) {
            System.out.println(
                "  " + course.getCourseName()
            );
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Coursee> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association + Communication
    public void assignCourse(Coursee course) {
        courses.add(course);
        course.assignProfessor(this);

        System.out.println(
            name + " is teaching " +
            course.getCourseName()
        );
    }

    public void displayCourses() {
        System.out.println(
            "Courses taught by " + name + ":"
        );

        for (Coursee course : courses) {
            System.out.println(
                "  " + course.getCourseName()
            );
        }
    }
}

class Coursee {
    private String courseName;
    private ArrayList<Student> students;
    private Professor professor;

    public Coursee(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void display() {
        System.out.println(
            "\nCourse: " + courseName
        );

        if (professor != null) {
            System.out.println(
                "Professor: " + professor.getName()
            );
        }

        System.out.println("Students:");

        for (Student student : students) {
            System.out.println(
                "  " + student.getName()
            );
        }
    }
}

public class University_Management {

    public static void main(String[] args) {

        // Students exist independently
        Student student1 = new Student("Chaitanya");
        Student student2 = new Student("Rahul");
        Student student3 = new Student("Priya");

        // Professors exist independently
        Professor professor1 = new Professor("Dr. Sharma");
        Professor professor2 = new Professor("Dr. Mehta");

        // Courses exist independently
        Coursee java = new Coursee("Java");
        Coursee dbms = new Coursee("DBMS");
        Coursee cloud = new Coursee("Cloud Computing");

        // Students enroll in courses
        student1.enrollCourse(java);
        student1.enrollCourse(dbms);

        student2.enrollCourse(java);
        student2.enrollCourse(cloud);

        student3.enrollCourse(dbms);
        student3.enrollCourse(cloud);

        // Professors teach courses
        professor1.assignCourse(java);
        professor1.assignCourse(dbms);

        professor2.assignCourse(cloud);

        // Display
        System.out.println();

        student1.displayCourses();

        System.out.println();

        professor1.displayCourses();

        java.display();
        dbms.display();
        cloud.display();
    }
}
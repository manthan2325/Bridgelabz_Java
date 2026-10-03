import java.util.*;

class Course{
    private String name;
    private ArrayList<Students> students;

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Students student){
        students.add(student);
    }
    public String getCourseName(){
        return name;
    }
    public void display(){
        System.out.println("Course Name is : " + name);
        for(Students student : students){
            System.out.println("Student Name's are : " + student.getName());
        }
    }
}

class Students{
    private String name;
    private ArrayList<Course> courses;

    public Students(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Courses of " + name + ":");
        for(Course course : courses){
            System.out.println(" " + course.getCourseName());
        }
    }
}
class School{
    private String name;
    private ArrayList<Students> students;

    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudents(Students student){
        students.add(student);
    }
    public void display(){
        System.out.println("School Name is : " + name);
        for(Students student : students){
            System.out.println("Students are : " + student.getName());
        }
    }
}
public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School school1 = new School("SRM");

        Students s1 = new Students("Manthan");
        Students s2 = new Students("Rohan");
        Students s3 = new Students("Aditya");

        Course c1 = new Course("Maths");
        Course c2 = new Course("Physics");

        school1.addStudents(s1);
        school1.addStudents(s2);
        school1.addStudents(s3);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        school1.display();

        s1.display();
        s2.display();

        c1.display();
        c2.display();



    }
}

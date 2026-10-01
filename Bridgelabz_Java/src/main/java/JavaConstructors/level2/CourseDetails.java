import java.util.*;

class Course{
    String courseName;
    int duration;
    double fee;
    static String insituteName = "SRM";
    public Course(){
        this("User",0,0.0);
    }
    public Course(String courseName,int duration,double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void display(){
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
        System.out.printf("Fee   : Rs. %.2f%n", fee);
        System.out.println("Institute   : " + insituteName);
    }
}

public class CourseDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Course Name");
        String courseName = sc.nextLine();

        System.out.println("Enter the Duration in months");
        int duration = sc.nextInt();

        System.out.println("Enter the Fee");
        double fee = sc.nextDouble();

        Course course1 = new Course();
        Course course2 = new Course(courseName,duration,fee);

        System.out.println("Course with Non-Parameterised constructor");
        course1.display();
        System.out.println("Course display with parameterised constructor");
        course2.display();

        sc.close();
    }
}

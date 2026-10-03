import java.util.*;


class Courseee {
    protected String courseName;
    protected int duration;

    public Courseee(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Courseee {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {

        super(courseName, duration);

        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {

        super(courseName, duration, platform, isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseMultiInheritance {
    public static void main(String[] args) {

        Courseee course =
                new Courseee("Java Basics", 6);

        OnlineCourse onlineCourse =
                new OnlineCourse("Java OOP", 8,
                                  "Udemy", true);

        PaidOnlineCourse paidCourse =
                new PaidOnlineCourse("Advanced Java", 12,
                                      "Coursera", true,
                                      5000, 20);

        course.display();

        System.out.println();

        onlineCourse.display();

        System.out.println();

        paidCourse.display();
    }
}
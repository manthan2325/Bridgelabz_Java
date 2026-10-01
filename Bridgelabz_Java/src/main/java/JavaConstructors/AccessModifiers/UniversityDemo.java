import java.util.Scanner;


class Student {
    public final int rollNumber;      // public: readable by anyone
    protected String name;            // protected: this package + subclasses
    private double cgpa;              // private: only this class

    // Default constructor
    public Student() {
        this(0, "Unknown", 0.0);
    }

    // Main constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = cleanText(name);
        this.cgpa = isValidCgpa(cgpa) ? cgpa : 0.0;
    }

    // Controlled access to the private CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Returns true if the update was accepted
    public boolean setCgpa(double cgpa) {
        if (!isValidCgpa(cgpa)) {
            return false;
        }
        this.cgpa = cgpa;
        return true;
    }

    private static boolean isValidCgpa(double value) {
        return value >= 0.0 && value <= 10.0;
    }

    private static String cleanText(String value) {
        return (value == null || value.trim().isEmpty()) ? "Unknown" : value.trim();
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.printf("CGPA       : %.2f%n", cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent() {
        this(0, "Unknown", 0.0, "Not assigned");
    }

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchTopic) {
        super(rollNumber, name, cgpa);
        this.researchTopic = (researchTopic == null || researchTopic.trim().isEmpty())
                ? "Not assigned" : researchTopic.trim();
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    // Protected member used directly in the subclass
    public void introduce() {
        System.out.println("Hello, I am " + name + ", a postgraduate student researching "
                + researchTopic + ".");
    }

    // CGPA is private in Student, so the subclass must use the public getter
    public boolean isResearchEligible() {
        return getCgpa() >= 7.5;
        // return cgpa >= 7.5;   // compile error: cgpa has private access in Student
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research   : " + researchTopic);
        System.out.println("Eligible   : " + (isResearchEligible() ? "Yes" : "No"));
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Student s = new Student(101, "Arun", 8.2);
        PostgraduateStudent pg = new PostgraduateStudent(201, "Priya", 8.8, "Machine Learning");

        System.out.println("--- Student ---");
        s.display();

        System.out.println("\n--- Postgraduate Student ---");
        pg.display();
        pg.introduce();

        System.out.println("\nUpdating CGPA:");
        System.out.println("Set to 9.1: " + (pg.setCgpa(9.1) ? "accepted" : "rejected"));
        System.out.println("Set to 15 : " + (pg.setCgpa(15) ? "accepted" : "rejected"));
        System.out.printf("Current CGPA: %.2f%n", pg.getCgpa());
    }
}
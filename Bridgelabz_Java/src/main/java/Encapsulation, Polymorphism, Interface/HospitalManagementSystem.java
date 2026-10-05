/*
 * 7. Hospital Patient Management
 * Description: Design a system to manage patients in a hospital:
 * Create an abstract class Patient with fields like patientId, name, and age.
 * Add an abstract method calculateBill() and a concrete method
 * getPatientDetails().
 * Extend it into subclasses InPatient and OutPatient, implementing
 * calculateBill() with different billing logic.
 * Implement an interface MedicalRecord with methods addRecord() and
 * viewRecords().
 * Use encapsulation to protect sensitive patient data like diagnosis and
 * medical history.
 * Use polymorphism to handle different patient types and display their billing
 * details dynamically.
 * 
 * Date: 4 oct
 */

interface MedicalRecord {
    void addRecord(String diagnosis);

    void viewRecords();
}

abstract class Patient { // abstract class
    int patientId;
    String name;
    int age;
    private String diagnosis;

    Patient(int id, String name, int age) {
        patientId = id;
        this.name = name;
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    int days;
    double dailyCharge;

    InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.days = days;
        dailyCharge = charge;
    }

    double calculateBill() {
        return days * dailyCharge;
    }

    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;

    OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        consultationFee = fee;
    }

    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Dheeraj", 21, 3, 2000);
        Patient p2 = new OutPatient(102, "Rahul", 25, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        System.out.println();

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}
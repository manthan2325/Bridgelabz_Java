import java.util.Scanner;

/*
 * Program to Demonstrate Hospital Management System
 *
 * Problem Statement:
 * Create a Patient class with the following features:
 *
 * 1. Use a static variable hospitalName shared among all patients.
 * 2. Use a static method getTotalPatients() to count the
 *    total number of patients admitted.
 * 3. Use this keyword to initialize name, age, and ailment
 *    in the constructor.
 * 4. Use a final variable patientID to uniquely identify
 *    each patient.
 * 5. Use instanceof to check whether an object belongs
 *    to the Patient class before displaying its details.
 *
 * Author: Manthan Hanchate
 * Date: 02-10-2026
 */

class Patient {

    // Static variable shared by all Patient objects
    private static String hospitalName = "Apollo Hospital";

    // Static variable to keep track of total patients
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Final variable - cannot be changed after initialization
    private final int patientID;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {

        // Using this keyword to initialize instance variables
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increase patient count whenever a Patient object is created
        totalPatients++;
    }

    // Static method to return total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayDetails() {

        System.out.println("\nPatient Details:");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking patient details from the user
        System.out.print("Enter Patient ID: ");
        int patientID = sc.nextInt();

        // Consume the leftover newline
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();

        // Consume the leftover newline
        sc.nextLine();

        System.out.print("Enter Patient Ailment: ");
        String ailment = sc.nextLine();

        // Creating a Patient object
        Patient patient = new Patient(
                name,
                age,
                ailment,
                patientID
        );

        // Checking whether the object is an instance of Patient
        if (patient instanceof Patient) {

            // Display patient details
            patient.displayDetails();
        }

        // Displaying total number of patients
        System.out.println("\nTotal Patients Admitted: "
                + Patient.getTotalPatients());

        sc.close();
    }
}
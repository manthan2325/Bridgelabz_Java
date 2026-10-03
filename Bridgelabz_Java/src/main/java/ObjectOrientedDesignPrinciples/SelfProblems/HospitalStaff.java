import java.util.*;

class Doctors{
    private String name;
    private ArrayList<Patients> patients;

    public Doctors(String name){
        this.name = name;
        this.patients = new ArrayList<>();
    }
    // display the association relationship where both exist independently
    public void addPatients(Patients patient){
        patients.add(patient);
        patient.addDoctor(this);
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Doctor Name is : " + name);
        for(Patients patient : patients){
            System.out.println("Patient Name are : " + patient.getName());
        }
    }
}
class Patients{
    private String name;
    private ArrayList<Doctors> doctors;

    public Patients(String name){
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addDoctor(Doctors doctor){
        doctors.add(doctor);
    }
    public void display(){
        System.out.println("Patient Name is : " + name);
        for(Doctors doc : doctors){
            System.out.println("Doctor name is : " + doc.getName());
        }
    }
}
class Hospital{
    private String name;
    private ArrayList<Patients> patients;
    private ArrayList<Doctors> doctors;

    public Hospital(String name){
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void addPatient(Patients patient){
        patients.add(patient);
    }
    public void addDoctor(Doctors doctor){
        doctors.add(doctor);
    }
}
public class HospitalStaff {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("SRM");

        Patients p1 = new Patients("RAM");
        Patients p2 = new Patients("Manthan");
        Patients p3 = new Patients("Sid");

        Doctors d1 = new Doctors("DR.RAM");
        Doctors d2 = new Doctors("DR JAY");

       d1.addPatients(p1);
       d1.addPatients(p2);
       d1.addPatients(p3);

       d2.addPatients(p1);
       d2.addPatients(p2);
       d2.addPatients(p3);

       d1.display();
       d2.display();

       p1.display();
       p2.display();
       p3.display();

    }
}

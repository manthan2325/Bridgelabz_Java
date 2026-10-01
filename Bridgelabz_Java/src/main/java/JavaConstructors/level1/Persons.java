import java.util.*;

/*
 * Program to Demonstrate Constructor Chaining in Circle
 *
 * Problem Statement:
 * Write a Circle class with a radius attribute.
 * Use constructor chaining to initialize radius with
 * default and user-provided values.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Person{
    private String name;
    private int age;

    // default Constructor
    public Person(){
        this("Unknown",0);
    }
    // Paramterised Constructor
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Copy Constructor
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    // Display function to show details of the person
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
public class Persons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of person");
        String name = sc.nextLine();
        System.out.println("Enter the age of person");
        int age = sc.nextInt();

        // Parameterised constructor call
        Person p1 = new Person(name,age);

        // Copy Constructor call
        Person p2 = new Person(p1);
        System.out.println("Parameterised Constrcutor");
        p1.display();
        System.out.println("Copy Constrcutor");
        p2.display();
        sc.close();
    }
}

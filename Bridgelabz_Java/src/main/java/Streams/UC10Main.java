package main.java.Streams;
/*
Ability to get number
of contact persons i.e.
count by City or State
- Search Result will show count by city and by
state

UC 10 - Use Java Streams
Name: Manthan Hanchate
Date: 29/10/2026

*/
import java.util.*;
import java.util.stream.*;

public class UC10Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("Friends");

        book.addContact(new Contact(
                "Manthan", "Hanchate", "Address 1",
                "Chennai", "Tamil Nadu", "600001",
                "7219551703", "mh@example.com"));

        book.addContact(new Contact(
                "Rahul", "Sharma", "Address 2",
                "Chennai", "Tamil Nadu", "600002",
                "9876501234", "r@example.com"));

        book.addContact(new Contact(
                "Aman", "Verma", "Address 3",
                "Delhi", "Delhi", "110001",
                "9876500000", "a@example.com"));

        Map<String, Long> cityCount = //creating a map to store the contacts based on the city
                book.getContacts().stream()
                    .collect(Collectors.groupingBy(
                            Contact::getCity,
                            TreeMap::new,
                            Collectors.counting()));

        cityCount.forEach((city, count) -> //for each loop to print the contacts based on the city
                System.out.println(city + " : " + count)); //printing the contacts based on the city
    }
}
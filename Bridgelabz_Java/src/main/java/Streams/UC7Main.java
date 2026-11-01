package main.java.Streams;
/*
Check for duplicates
Name: Manthan Hanchate
Date: 29/10/2026
*/
public class UC7Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("Friends"); //creating a address book

        Contact c1 = new Contact(
                "Manthan", "Hanchate", "Address 1",
                "Chennai", "Tamil Nadu", "600001",
                "9876543210", "u@example.com"); //creating a contact

        Contact c2 = new Contact(
                "Manthan", "Hanchate", "Address 2",
                "Pune", "Pune", "110001",
                "9999999999", "u2@example.com"); //creating a contact

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("Total contacts: "
                + book.getContacts().size()); //printing the total contacts
    }
}
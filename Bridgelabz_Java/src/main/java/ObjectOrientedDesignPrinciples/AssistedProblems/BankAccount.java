import java.util.*;

// Problem 1: Library and Books (Aggregation)
//
// Create a Library class that contains multiple Book objects.
// The relationship between Library and Book is aggregation.
//
// A Library can have many Books,
// but a Book can exist independently without a Library.
//

class Bank{
    private String name;
    private ArrayList<Customerr> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void openAccount(Customerr customer){
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + ":" + name);
    }
    public void display(){
        System.out.println("The Bank Name is : " + name);
        for(Customerr customer : customers){
            System.out.println(customer.getName());
        }
    }
}
class Customerr{
    private String name;
    private double balance;

    public Customerr(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public void getBalance(){
        System.out.println("Balance is : " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Customer Name");
        String CustomerName  = sc.nextLine();

        System.out.println("Enter the balance");
        double balance = sc.nextDouble();
        sc.nextLine();

        Customerr customer1 = new Customerr(CustomerName, balance);

        System.out.println("Enter the Customer Name");
        String CustomerName1  = sc.nextLine();

        System.out.println("Enter the balance");
        double balance1 = sc.nextDouble();

        Customerr customer2 = new Customerr(CustomerName1, balance1);

        Bank bank1 = new Bank("SBI");
        bank1.openAccount(customer1);
        bank1.openAccount(customer2);

        customer1.getBalance();
        customer2.getBalance();

        bank1.display();

        sc.close();
    }
}

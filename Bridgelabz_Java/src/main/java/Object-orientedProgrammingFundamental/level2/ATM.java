import java.util.*;

/*
 * Program to Simulate an ATM
 *
 * Problem Statement:
 * Create a BankAccount class with attributes accountHolder,
 * accountNumber, and balance.
 * Add methods for:
 * 1. Depositing money.
 * 2. Withdrawing money only if sufficient balance exists.
 * 3. Displaying the current balance.
 *
 * The program:
 * 1. Creates a BankAccount class.
 * 2. Defines accountHolder, accountNumber, and balance as attributes.
 * 3. Creates a method to deposit money.
 * 4. Creates a method to withdraw money.
 * 5. Checks if sufficient balance is available before withdrawal.
 * 6. Creates a method to display the current balance.
 * 7. Takes account details and transaction amount as input.
 * 8. Displays the updated account balance.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class BankAccount{
    String accountholder;
    int accountno;
    double balance;

    public void deposit(double money){
        balance += money;
    }
    public void withdraw(double money){
        if(money > balance){
            System.out.println("Failed to Withdraw");
        }else{
            balance -= money;
        }
    }
    public void display(){
        System.out.println("The account holder name is " + accountholder);
        System.out.println("The account no is " + accountno);
        System.out.println("Current balance is " + balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount ba = new BankAccount();

        System.out.println("Enter the account holder's name");
        ba.accountholder = sc.next();

        System.out.println("Enter the account id");
        ba.accountno = sc.nextInt();

        System.out.println("Enter the balance ");
        ba.balance = sc.nextDouble();

        System.out.println("Enter the amount to be deposited or withdrawn");
        double money = sc.nextDouble();
        System.out.println("Withdraw or deposit");
        String s = sc.next();
        if(s.equals("deposit")){
            ba.deposit(money);
        }else{
            ba.withdraw(money);
        }
        ba.display();
        sc.close();
    }
}

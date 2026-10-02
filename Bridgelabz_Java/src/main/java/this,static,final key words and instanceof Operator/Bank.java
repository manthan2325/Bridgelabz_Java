import java.util.*;
/*
Problem No : 1
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
Name : Utakarsh Jain
Date : 30/09/2026
*/

class BankAccount{
    private static String bankName = "Bridgelabz_Bank";
    private String accountholder;
    // final variable is assigned so account Number cannot be changed once assigned.
    private final int accountNumber;
    private static int totalAccounts = 0;

    public BankAccount(String accountholder,int accountNumber){
        this.accountholder = accountholder;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public static String getBankName(){
        return bankName;
    }
    public void display(){
        System.out.println("Account Holder Name is : " + accountholder);
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Bank Name is : " + BankAccount.getBankName());    
    }
}
public class Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Holder Name");
        String accountholder = sc.nextLine();

        System.out.println("Enter the Account Number");
        int accountNumber = sc.nextInt();

        BankAccount account = new BankAccount(accountholder,accountNumber);
        // Check if the account object is an instance of BankAccount or its subclasses before displaying its details
        if(account instanceof BankAccount){
            account.display();
        }
        System.out.println("Total Accounts in " + BankAccount.getBankName() + " is : " + BankAccount.getTotalAccounts());
    }
}

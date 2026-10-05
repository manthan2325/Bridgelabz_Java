/*
 * 4. Banking System
 * Description: Create a banking system with different account types:
 * Define an abstract class BankAccount with fields like accountNumber,
 * holderName, and balance.
 * Add methods like deposit(double amount) and withdraw(double amount)
 * (concrete) and calculateInterest() (abstract).
 * Implement subclasses SavingsAccount and CurrentAccount with unique interest
 * calculations.
 * Create an interface Loanable with methods applyForLoan() and
 * calculateLoanEligibility().
 * Use encapsulation to secure account details and restrict unauthorized access.
 * Demonstrate polymorphism by processing different account types and
 * calculating interest dynamically.
 * rental and insurance costs for each.
 * 
 * Date: 4 oct
 */

interface Loanable {
    void applyForLoan();

    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() {
        return balance;
    }

    abstract double calculateInterest(); // abstarct class
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() { // function overriding
        return getBalance() * 0.05;
    }

    public void applyForLoan() { // interface class
        System.out.println("Savings Account loan applied");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.03;
    }

    public void applyForLoan() {
        System.out.println("Current Account loan applied");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount(101, "Dheeraj", 20000);

        BankAccount account2 = new CurrentAccount(102, "Rahul", 60000);

        account1.deposit(5000);
        account2.withdraw(10000);

        System.out.println("Savings Interest: "
                + account1.calculateInterest());

        System.out.println("Current Interest: "
                + account2.calculateInterest());

        System.out.println();

        Loanable loan1 = (Loanable) account1; // casting
        Loanable loan2 = (Loanable) account2;

        loan1.applyForLoan();
        System.out.println("Savings Loan Eligible: "
                + loan1.calculateLoanEligibility());

        loan2.applyForLoan();
        System.out.println("Current Loan Eligible: "
                + loan2.calculateLoanEligibility());
    }
}
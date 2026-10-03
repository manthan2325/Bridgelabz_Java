import java.util.*;

class Bank_Account{
    protected String accountNumber;
    protected int balance;

    public Bank_Account(String accountNumber,int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Bank Account Number is : " + accountNumber);
        System.out.println("Bank Balance is : " + balance);        
    }
}
class SavingsAccount extends Bank_Account{
    private int interestRate;

    public SavingsAccount(String accountNumber,int balance,int interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    @Override 
    public void display(){
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends Bank_Account{
    private int withdrawalLimit;
    public CheckingAccount(String accountNumber,int balance,int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void display(){
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
class FixedDepositAccount extends Bank_Account {
    private int duration;

    public FixedDepositAccount(String accountNumber, int balance,
                               int duration) {

        super(accountNumber, balance);
        this.duration = duration;
    }

    @Override
    public void display() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Duration: " + duration + " years");
    }
}
public class BankDisplay {
    public static void main(String[] args) {
        SavingsAccount savings =
                new SavingsAccount("S101", 50000, 6);

        CheckingAccount checking =
                new CheckingAccount("C101", 30000, 10000);

        FixedDepositAccount fixedDeposit =
                new FixedDepositAccount("FD101", 100000, 5);

        savings.display();

        System.out.println();

        checking.display();

        System.out.println();

        fixedDeposit.display();
    }
}

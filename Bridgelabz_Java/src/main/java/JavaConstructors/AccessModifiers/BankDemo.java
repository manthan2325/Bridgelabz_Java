class BankAccount {
    public final String accountNumber;     // public: readable by anyone, never changes
    protected String accountHolder;        // protected: this package + subclasses
    private double balance;                // private: only this class

    // Default constructor
    public BankAccount() {
        this("Unknown", "Unknown", 0.0);
    }

    // Main constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = cleanText(accountNumber);
        this.accountHolder = cleanText(accountHolder);
        this.balance = balance < 0 ? 0.0 : balance;
    }

    // Controlled access to the private balance
    public double getBalance() {
        return balance;
    }

    // Returns true if the deposit was accepted
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    // Returns true if the withdrawal was accepted
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    private static String cleanText(String value) {
        return (value == null || value.trim().isEmpty()) ? "Unknown" : value.trim();
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance       : Rs. %.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;      // percent per year

    public SavingsAccount() {
        this("Unknown", "Unknown", 0.0, 4.0);
    }

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate < 0 ? 0.0 : interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Uses the public and protected members directly
    public void showAccessDemo() {
        System.out.println("Public    -> Account Number: " + accountNumber);       // public
        System.out.println("Protected -> Account Holder: " + accountHolder);       // protected, direct access
        System.out.printf("Private   -> Balance       : Rs. %.2f%n", getBalance()); // private, via getter only
        // System.out.println(balance);   // compile error: balance has private access in BankAccount
    }

    // Subclass can modify the protected field directly
    public void updateAccountHolder(String newHolder) {
        if (newHolder != null && !newHolder.trim().isEmpty()) {
            accountHolder = newHolder.trim();
        }
    }

    // Balance is private, so the subclass must use deposit()
    public boolean addInterest() {
        double interest = getBalance() * interestRate / 100;
        return deposit(interest);
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Interest Rate : %.1f%%%n", interestRate);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC1001", "Arun", 5000.0);
        SavingsAccount savings = new SavingsAccount("SAV2001", "Priya", 10000.0, 5.0);

        System.out.println("--- Bank Account ---");
        account.display();

        System.out.println("\n--- Savings Account ---");
        savings.display();

        System.out.println("\n--- Access demo inside subclass ---");
        savings.showAccessDemo();

        System.out.println("\n--- Modifying balance ---");
        System.out.println("Deposit 2000    : " + (savings.deposit(2000) ? "accepted" : "rejected"));
        System.out.println("Deposit -500    : " + (savings.deposit(-500) ? "accepted" : "rejected"));
        System.out.println("Withdraw 3000   : " + (savings.withdraw(3000) ? "accepted" : "rejected"));
        System.out.println("Withdraw 50000  : " + (savings.withdraw(50000) ? "accepted" : "rejected"));
        System.out.printf("Current balance : Rs. %.2f%n", savings.getBalance());

        System.out.println("\n--- Subclass modifying protected field and adding interest ---");
        savings.updateAccountHolder("Priya Sharma");
        savings.addInterest();
        savings.display();
    }
}
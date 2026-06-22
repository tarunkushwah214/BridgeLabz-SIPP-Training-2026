class BankAccount {
    // Instance variables
    private String accountNumber;
    private String holder;
    private double balance;

    // Static variable to track total accounts
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println(holder + ": Insufficient balance! Withdrawal of ₹" + amount + " failed.");
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    // Get account statement
    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }

    // Static method to display total accounts
    public static void showTotalAccounts() {
        System.out.println("\nTotal Accounts Created: " + totalAccounts);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("ACC101", "Rahul", 10000);
        BankAccount acc2 = new BankAccount("ACC102", "Priya", 15000);
        BankAccount acc3 = new BankAccount("ACC103", "Amit", 8000);

        // 5 transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(1000);
        acc1.withdraw(5000);
        acc1.withdraw(7000); // Overdraft check

        // 5 transactions for Account 2
        acc2.withdraw(3000);
        acc2.deposit(2500);
        acc2.withdraw(5000);
        acc2.deposit(1500);
        acc2.withdraw(12000); // Overdraft check

        // 5 transactions for Account 3
        acc3.deposit(1000);
        acc3.withdraw(2000);
        acc3.deposit(500);
        acc3.withdraw(3000);
        acc3.withdraw(5000);

        // Print account statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Display total accounts created
        BankAccount.showTotalAccounts();
    }
}
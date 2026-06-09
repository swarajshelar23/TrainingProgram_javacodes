package DAY8.OOPS.SBI;

public class SBI {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    SBI() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "0000000000";
        this.balance = 0.0;
    }

    // Constructor with parameters
    SBI(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("wah aamir log: Rs." + this.balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("kya karra bhai tu, paisa nahi hai tere account me");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is Rs." + this.balance);
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Your current balance is Rs." + this.balance);
    }

    // Fixed Deposit Calculator
    public void fixedDepositCalculator(double principal, int time) {
        double interest = (principal * 7 * time) / 100;
        System.out.println("The interest is Rs." + interest + " Mast paisa banega bhai");
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Check account type based on account number
    static String CheckAccount(String AccountNumber) {
        if (AccountNumber.endsWith("BUS")) {
            return "Business Account";
        } else if (AccountNumber.endsWith("COR")) {
            return "CORPORATE ACCOUNT";
        } else {
            return "Savings Account";
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + CheckAccount(this.accountNumber));
        System.out.println("Current Balance: Rs." + this.balance);
    }
}



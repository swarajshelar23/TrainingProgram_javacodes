package DAY8.OOPS.HDFC;

public class HDFC {
    String accountHolderName;
    String accountNumber;
    double balance;

    HDFC(String accountHolderName, String accountNumber, double balance){
        if(accountHolderName == null || accountHolderName.isEmpty()){
            accountHolderName = "Unknown";
        }else
        {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        if(accountNumber == null || accountNumber.isEmpty()){
            accountNumber = "0000000000";
        }
        else{
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        
    }

    void displayAccountDetails(){
        System.out.println("-----------------------------");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------");
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

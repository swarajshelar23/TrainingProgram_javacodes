package DAY8.OOPS.SBI;

import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // HashMap to store accounts with account number as key
        HashMap<String, SBI> accounts = new HashMap<>();
        
        // Add some default accounts for testing
        accounts.put("SBI1001", new SBI("Rajesh Kumar", "SBI1001", 10000));
        accounts.put("SBI1002", new SBI("Priya Singh", "SBI1002BUS", 15000));
        accounts.put("SBI1003", new SBI("Amit Sharma", "SBI1003COR", 20000));
        accounts.put("SBI1004", new SBI("Sneha Patel", "SBI1004", 25000));
        
        try (Scanner obj = new Scanner(System.in)) {
            int mainOption = 0;
            
            while (mainOption != 3) {
                System.out.println("\n========== SBI Bank System ==========");
                System.out.println("Press 1 to Access Account");
                System.out.println("Press 2 to Create New Account");
                System.out.println("Press 3 to Exit");
                mainOption = obj.nextInt();
                
                switch (mainOption) {
                    case 1:
                        // Access existing account
                        System.out.println("Enter your account number:");
                        String accountNumber = obj.next();
                        
                        if (accounts.containsKey(accountNumber)) {
                            SBI currentAccount = accounts.get(accountNumber);
                            System.out.println("\nWelcome " + currentAccount.getAccountHolderName());
                            accessAccount(currentAccount, obj);
                        } else {
                            System.out.println("Account not found!");
                        }
                        break;
                        
                    case 2:
                        // Create new account
                        System.out.println("Enter account holder name:");
                        String name = obj.next();
                        System.out.println("Enter account number:");
                        String newAccNumber = obj.next();
                        System.out.println("Enter initial balance:");
                        double initialBalance = obj.nextDouble();
                        
                        if (!accounts.containsKey(newAccNumber)) {
                            accounts.put(newAccNumber, new SBI(name, newAccNumber, initialBalance));
                            System.out.println("Account created successfully!");
                        } else {
                            System.out.println("Account number already exists!");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Thank you for using SBI Bank!");
                        break;
                        
                    default:
                        System.out.println("unpadh hai kya bhai, sahi option choose kar");
                }
            }
        }
    }
    
    // Method to handle account operations
    static void accessAccount(SBI account, Scanner obj) {
        int option = 0;
        
        while (option != 6) {
            System.out.println("\n--- Account Operations ---");
            System.out.println("Account Type: " + SBI.CheckAccount(account.getAccountNumber()));
            System.out.println("Current Balance: Rs." + account.getBalance());
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdraw");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for Fixed Deposit Calculator");
            System.out.println("Press 5 for account details");
            System.out.println("Press 6 to Go Back");
            option = obj.nextInt();
            
            switch (option) {
                case 1:
                    // Deposit
                    System.out.println("Enter the amount to deposit:");
                    double deposit = obj.nextDouble();
                    account.deposit(deposit);
                    break;
                    
                case 2:
                    // Withdraw
                    System.out.println("Enter the amount to withdraw:");
                    double withdraw = obj.nextDouble();
                    account.withdraw(withdraw);
                    break;
                    
                case 3:
                    // Check Balance
                    account.checkBalance();
                    break;
                    
                case 4:
                    // FD Calculator
                    System.out.println("Enter the amount to calculate fixed deposit:");
                    double principal = obj.nextDouble();
                    System.out.println("Enter the time in years:");
                    int time = obj.nextInt();
                    account.fixedDepositCalculator(principal, time);
                    break;
                    
                case 5:
                    account.displayAccountDetails();
                    break;

                case 6:
                    System.out.println("Returning to main menu...");
                    break;
                    
                default:
                    System.out.println("unpadh hai kya bhai, sahi option choose kar");
            }
        }
    }
}
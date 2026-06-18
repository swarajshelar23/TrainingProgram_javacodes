package DAY3.function;

import java.util.Scanner;



public class banksystem {

    //Deposit
    static int deposit(int deposit, int balance){
        balance = balance + deposit;
        System.out.println("wah aamir log:" + balance);
        return balance;
    }
    //Withdraw
    static int withdraw(int withdraw, int balance){
        if(withdraw > balance){
                    System.out.println("kya karra bhai tu, paisa nahi hai tere account me");
                }
                else{
                    balance -= withdraw;
                    System.out.println("Your new balance is " + balance);
                }
        return balance;
    }

    //Check Balance
    static void checkBalance(int balance){
        System.out.println("Your current balance is " + balance);
    }

    //Fixed Deposit Calculator
    static void fixedDepositCalculator(int principal, int time){
        float interest = (principal * 7 * time) / 100;
        System.out.println("The interest is " + interest + " Mast paisa banega bhai");
    }
    static int updatebalance(int balance){

        int newbalance = balance;
        return newbalance;
    }
    public static void main(String[] args){
        int balance = 10000;

        Scanner obj = new Scanner(System.in);
        int option = 0;
        while(option != 5){
            System.out.println("Press 1 for Deposit");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Check Balance");
        System.out.println("Press 4 for Fixed deposit calculator");
        System.out.println("Press 5 to Exit");
        option = obj.nextInt();
       
        switch(option){
            case 1:
                //Deposit
                System.out.println("Enter the amount to deposit");
                int deposit = obj.nextInt();
                balance = deposit(deposit, balance);
                break;
            case 2:
                //Withdraw
                System.out.println("Enter the amount to withdraw");
                int withdraw = obj.nextInt();
                balance = withdraw(withdraw, balance);
                break;
            case 3:
                //Check Balance
                checkBalance(balance);
                break;
            case 4:
                // FD Calculator
                System.out.println("Enter the amount to calculate fixed deposit");
                int principal = obj.nextInt();
                System.out.println("Enter the time in years");
                int time = obj.nextInt();
                fixedDepositCalculator(principal, time);
                break;
            case 5:

            default:
                System.out.println("unpadh hai kya bhai, sahi option choose kar");
    }
    }
}

}

package DAY2.Practice;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args){
        int balance = 10000;
        System.out.println("Press 1 for Deposit");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Check Balance");
        System.out.println("Press 4 for Fixed deposit calculator");
        Scanner obj = new Scanner(System.in);
        int option = obj.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the amount to deposit");
                int deposit = obj.nextInt();
                balance = balance + deposit;
                System.out.println("wah aamir log" + balance);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw");
                int withdraw = obj.nextInt();
                if(withdraw > balance){
                    System.out.println("kya karra bhai tu, paisa nahi hai tere account me");
                }
                else{
                    balance -= withdraw;
                    System.out.println("Your new balance is " + balance);
                }
                break;
            case 3:
                System.out.println("Your current balance is " + balance);
                break;
            case 4:
                System.out.println("Enter the amount to calculate fixed deposit");
                int principal = obj.nextInt();
                float rate = 7;
                System.out.println("Enter the time in years");
                int time = obj.nextInt();
                float interest = (principal * rate * time) / 100;
                System.out.println("The interest is " + interest + " Mast paisa banega bhai");
                break;
            default:
                System.out.println("unpadh hai kya bhai, sahi option choose kar");
    }
}}

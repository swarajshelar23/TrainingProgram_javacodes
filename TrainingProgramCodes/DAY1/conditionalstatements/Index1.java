package conditionalstatements;

import java.util.Scanner;
public class Index1 {
    public static void main(String[] args) {
        int balance = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = sc.nextInt();

        if(amount < balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

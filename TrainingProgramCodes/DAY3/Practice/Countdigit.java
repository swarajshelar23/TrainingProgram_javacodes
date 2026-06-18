package DAY3.Practice;

import java.util.Scanner;
public class Countdigit {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to count the digits");
        int n = num.nextInt();
        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        temp = n;
        double sum = 0;
        while(temp!=0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp = temp/10;
        }
        System.out.println(sum);
        if (sum == n){
            System.out.println(n + " is an Armstrong number");
        }
        else{
            System.out.println(n + " is not an Armstrong number");
        }
}
}
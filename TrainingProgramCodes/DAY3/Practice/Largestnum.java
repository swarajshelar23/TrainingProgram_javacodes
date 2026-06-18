package DAY3.Practice;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = num.nextInt();
        int largest = 0;
        while(a!=0){
            int digit = a % 10;
            if (digit > largest){
                largest = digit;
            }
            a = a/10;
        }
        System.out.println("Largest digit: " + largest);
        num.close();
    }
}

package DAY4.RECURSION;

import java.util.Scanner;

public class Reverse {
    static int revNum(int n, int rev){
        if(n==0){
            return rev;
        }
        else{
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            return revNum(n / 10, rev);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = sc.nextInt();
        int result = revNum(num, 0);
        System.out.println("Reverse of " + num + " is: " + result);
        sc.close();
    }

}
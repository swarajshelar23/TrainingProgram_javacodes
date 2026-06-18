package DAY4.RECURSION;

import java.util.Scanner;

public class primenum {
    static boolean isPrime(int n, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else if (isPrime(n, n / 2)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}

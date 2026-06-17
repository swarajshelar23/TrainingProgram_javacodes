package DAY3.Practice;

import java.util.Scanner;

public class Primeseries {
     static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of prime numbers");
        int num = sc.nextInt();
        for(int i = 2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
   


package DAY3.Practice;
import java.util.Scanner;
public class Sumofdigit {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to count the digits");
        int n = num.nextInt();
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

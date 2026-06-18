package DAY3.Practice;
import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        sc.close();
        
    }
}

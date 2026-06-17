package DAY3.Practice;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence");
        int n = num.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci sequence: ");
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        num.close();
    }
}

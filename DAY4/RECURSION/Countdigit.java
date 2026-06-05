package DAY4.RECURSION;
import java.util.Scanner;
public class Countdigit {

    static int countDigits(int n){
        if(n==0){
            return 0;

        }
        else{
            return 1 + countDigits(n/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers to count the digits");
        int num = sc.nextInt();
        int result = countDigits(num);
        System.out.println("Number of digits in " + num + " is: " + result);
        sc.close();

    }
}

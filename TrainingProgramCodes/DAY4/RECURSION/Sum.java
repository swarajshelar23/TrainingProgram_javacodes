package DAY4.RECURSION;
import java.util.Scanner;
public class Sum {
    static int sumofseries(int n){
        if(n==1){
            return 1;
        }
        else
            {
                return n+sumofseries(n-1);

        }
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("number bol:");
        int num = sc.nextInt();
        System.out.println("Sum of numbers from 1 to " + num + " is: " + sumofseries(num));

    }
}

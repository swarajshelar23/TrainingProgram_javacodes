package DAY4.Recursion;
import java.util.Scanner;

public class Additonofseries {
    static int sumofseries(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10) + sumofseries(n/10);

        }
        }
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("number bol:");
             int num = sc.nextInt();
                int result = sumofseries(num);
                System.out.println("sum of series is: " + result);
                sc.close();
    }
    }
    
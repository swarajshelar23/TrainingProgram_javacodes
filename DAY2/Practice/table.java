package DAY2.Practice;
import java.util.Scanner;
public class table {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int num = sc.nextInt();
        System.out.println("Tables for "+ num);
        for(int multiple = 1; multiple <=10; multiple++){
            int ans = num * multiple;
            System.out.println(num + " x " + multiple + " = " + ans);
        }
        
    }
}

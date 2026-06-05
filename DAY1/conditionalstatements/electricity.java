package conditionalstatements;
import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        if(1>=units && units<=100){
            System.out.println("Your electricity bill is: " + (units * 1));
        } else if(units > 100 && units <= 200){
            System.out.println("Your electricity bill is: " + (100 * 1 + (units - 100) * 2));
        } else if(units > 200 && units <= 300){
            System.out.println("Your electricity bill is: " + (100 * 1 + 100 * 2 + (units - 200) * 3));
        } else if(units > 300 && units <= 400){
            System.out.println("Your electricity bill is: " + (100 * 1 + 100 * 2 + 100 * 3 + (units - 300) * 4));
        } else {
            System.out.println("Your electricity bill is: " + (units * 4));
        }
    }
}

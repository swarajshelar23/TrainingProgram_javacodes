package Practice;
import java.util.Scanner;
public class Studentinput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter the first number: ");
        a = in.nextDouble();
        System.out.print("Enter the second number: ");
        b = in.nextDouble();
        System.out.print("Enter the third number: ");
        c = in.nextDouble();
        double sum = a + b + c;
        double percentage = (sum/300)*100;
        System.out.println("percentage:" + percentage + "%");
    }
}

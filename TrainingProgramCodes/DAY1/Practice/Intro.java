package Practice;
import java.util.Scanner;
public class Intro{
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = radius.nextDouble();
        double pi = 3.142;
        double area = pi*r*r;
        System.out.println("The area of the circle is: " + area);

    }
}
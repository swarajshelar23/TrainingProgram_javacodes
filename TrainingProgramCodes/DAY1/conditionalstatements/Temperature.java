package conditionalstatements;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in what you want to convert (Celsius(C) or Fahrenheit(F)):");
        char input = sc.next().charAt(0);
        if(input == 'C'|| input == 'c'){
            System.out.println("Enter the temperature in Fahrenheit:");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println("The temperature in Celsius is: " + celsius);
        } else if(input == 'F' || input == 'f') {
            System.out.println("Enter the temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } else {
            System.out.println("galat hai bhai");
        }
    }
}

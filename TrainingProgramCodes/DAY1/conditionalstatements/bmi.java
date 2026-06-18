package conditionalstatements;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}

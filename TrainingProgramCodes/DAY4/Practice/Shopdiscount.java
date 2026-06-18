package DAY4.Practice;
import java.util.Scanner;

public class Shopdiscount {
    static void Discount(double price, double discountPercentage){
        double discountAmount = (price * discountPercentage) / 100.0;
        double finalPrice = price - discountAmount;
        System.out.printf("Original Price: %.2f\n", price);
        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Final Price after Discount: %.2f\n", finalPrice);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double price = sc.nextDouble();
        double discountPercentage;
        if (price > 1000) {
            discountPercentage = 10.0; // Example discount percentage for prices over 1000
        } else if (price > 2000) {
            discountPercentage = 20.0; // Example discount percentage for prices 1000 or less
        }else if (price > 5000) {
            discountPercentage = 25.0; // No discount for prices 500 or less
        }
        else {
            discountPercentage = 0; // No discount for prices 500 or less
        }
        Discount(price, discountPercentage);
        sc.close();
    }
}

package DAY3.dowhile;
import java.util.Scanner;
public class shopwelcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char customer;

        do{
            System.out.print("Welcome to the shop! Are you a new customer? (y/n): ");
            System.out.println("Has Anyone entered the shop");
            customer = sc.next().charAt(0);

        }while(customer == 'y' || customer == 'Y');
        System.out.println("Thank you for visiting the shop!");
    }
}

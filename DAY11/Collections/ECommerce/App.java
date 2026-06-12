package DAY11.Collections.ECommerce;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Flipkart flipkart = new Flipkart();

        while (true) {

            System.out.println("\n===== FLIPKART MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Update Product");
            System.out.println("4. Sort Products");
            System.out.println("5. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                        flipkart.addToCart(
                            new Product(String.valueOf(id), name, price, category)
                        );
                    break;

                case 2:
                    flipkart.displayAllProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter New Product Name: ");
                    String newName = sc.nextLine();

                    flipkart.updateProductName(updateId, newName);
                    break;

                case 4:
                    flipkart.sortProducts();
                    break;

                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    String deleteId = sc.nextLine();

                    flipkart.deleteProduct(deleteId);
                    break;

                case 0:
                    System.out.println("Thank you for using Flipkart.");
                    sc.close();
                    return; // exits the program

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
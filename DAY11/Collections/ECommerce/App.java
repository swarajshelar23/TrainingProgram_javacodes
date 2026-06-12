package DAY11.Collections.ECommerce;

import javax.sound.sampled.Port;    
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Flipkart flipkart = new Flipkart();
        Product product1 = new Product("101", "Laptop", 50000, "Electronics");
        Product product2 = new Product("102", "Smartphone", 20000, "Electronics");
        Product product3 = new Product("103", "Headphones", 3000, "Electronics");
        Product product4 = new Product("104", "Book", 500, "Books");
        Product product5 = new Product("105", "Shoes", 1500, "Fashion");
        Product product6 = new Product("106", "Watch", 2500, "Accessories");
        flipkart.addToCart(product1);
        flipkart.addToCart(product2);
        flipkart.addToCart(product3);
        flipkart.addToCart(product4);
        flipkart.addToCart(product5);
        flipkart.addToCart(product6);

        while (true) {

            System.out.println("\n===== FLIPKART MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Update Product");
            System.out.println("4. Sort Products");
            System.out.println("5. Delete Product");
            System.out.println("6. Search Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

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
                    sc.nextLine();

                    System.out.print("Enter Product ID to update: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter New Product Name: ");
                    String newName = sc.nextLine();

                    flipkart.updateProductName(updateId, newName);
                    break;

                case 4:
                    System.out.println("Products sorted by price:");
                    List<Product> sortedProducts = flipkart.sortProductsByPrice();
                    for (Product product : sortedProducts) {
                        System.out.println(product);
                    }
                    break;

                case 5:
                    sc.nextLine();

                    System.out.print("Enter Product ID to delete: ");
                    String deleteId = sc.nextLine();

                    flipkart.deleteProduct(deleteId);
                    break;

                case 6:

                    System.out.print("Enter Product ID to search: ");
                    String searchId = sc.nextLine();

                    flipkart.searchProduct(searchId);
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
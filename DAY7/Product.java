package DAY7;

import java.util.Scanner;

public class Product {
    static void productDetails(String name[], double price[]){
        for(int i = 0; i < name.length; i++){
            System.out.println("Product name: " + name[i]);
        }
    }
    static void displayProductWithPrice(String[] name, double[] price) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter product name: ");
    String product = sc.nextLine();

    for (int i = 0; i < name.length; i++) {
        if (name[i].equalsIgnoreCase(product)) {
            System.out.println("Product: " + name[i] +" = " + price[i]);
            return;
        }
    }

    System.out.println("Product not found.");
}

    static void highestPricedProduct(String[] name, double[] price) {
        double highestPrice = price[0];
        String productName = name[0];

        for(int i = 0; i<name.length; i++){
            if(price[i] > highestPrice){
                highestPrice = price[i];
                productName = name[i];
            }
        }
        System.out.println("Highest priced product: " + productName + ", Price: " + highestPrice);
    }

    static void lowestPricedProduct(String[] name, double[] price) {
        double lowestPrice = price[0];
        String productName = name[0];

        for(int i = 0; i<name.length; i++){
            if(price[i] < lowestPrice){
                lowestPrice = price[i];
                productName = name[i];
            }
        }
        System.out.println("Lowest priced product: " + productName + ", Price: " + lowestPrice);
    }

    static void searchProductByName(String name[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String productName = sc.nextLine();
        for(int i = 0; i<name.length; i++){
            if(name[i].equalsIgnoreCase(productName)){
                System.out.println("Product found: " + name[i]);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void totalinventoryValue(String[] name, double[] price) {
        double totalValue = 0;
        for(int i = 0; i<name.length; i++){
            totalValue += price[i];
        }
        System.out.println("Total inventory value: " + totalValue);
    }

    static void viewproductswhichcontaincharacter(String[] name, char ch) {
        System.out.println("Products containing character '" + ch + "':");
        for (String productName : name) {
            if (productName.indexOf(ch) != -1) {
                System.out.println("- " + productName);
            }
        }
    }

    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Headphones", "Tablet", "Smartwatch"};
        double[] prices = {50000, 6000, 10000, 20000, 15000};
        
        productDetails(products, prices);
        displayProductWithPrice(products, prices);
        highestPricedProduct(products, prices);
        lowestPricedProduct(products, prices);
        searchProductByName(products);
        totalinventoryValue(products, prices);
        viewproductswhichcontaincharacter(products, 'a'); // Example: View products containing the character 'a'
    }
}
package DAY11.Collections.ECommerce;

import java.util.ArrayList;
import java.util.Iterator;

public class Flipkart {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product
    void addToCart(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added successfully.");
    }

    // Update Product Name
    void updateProductName(String productId, String newName) {

        for (Product product : products) {

            if (product.getProductId().equals(productId)) {
                product.setProductName(newName);
                System.out.println("Product updated successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Display All Products
    void displayAllProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Sort Products by Price
    void sortProducts() {

        products.sort((p1, p2) ->
                Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println("Products sorted by price.");
    }

    // Delete Product
    void deleteProduct(String productId) {

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();

            if (product.getProductId().equals(productId)) {
                iterator.remove();
                System.out.println("Product deleted successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }
}
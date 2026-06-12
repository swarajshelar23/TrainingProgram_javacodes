package DAY11.Collections.ECommerce;

import java.util.*;
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

    void searchProduct(String productId) {

    System.out.println("Searching for: [" + productId + "]");

    for (Product product : products) {

        System.out.println("Checking: [" + product.getProductId() + "]");

        if (product.getProductId().equals(productId)) {
            System.out.println("Product found: " + product);
            return;
        }
    }

    System.out.println("Product not found.");
}

    // Sort Products by Price
    // 
    public List<Product> sortProductsByPrice() {
        List<Product> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts);
        return sortedProducts;
    }

    // Delete Product
    void deleteProduct(String productId) {
        for (Product product : products) {

            if (product.getProductId().equals(productId)) {
                products.remove(product);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    }

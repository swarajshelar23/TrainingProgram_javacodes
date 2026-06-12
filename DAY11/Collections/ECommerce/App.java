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
        Review review1 = new Review("R101", "101", "Great laptop!", 5);
        Review review2 = new Review("R102", "102", "Good value for money.", 4);
        Review review3 = new Review("R103", "103", "Average sound quality.", 3);
        Review review4 = new Review("R104", "104", "Interesting read.", 4);
        Review review5 = new Review("R105", "105", "Comfortable shoes.", 5);
        flipkart.addToCart(product1);
        flipkart.addToCart(product2);
        flipkart.addToCart(product3);
        flipkart.addToCart(product4);
        flipkart.addToCart(product5);
        flipkart.addToCart(product6);
        flipkart.addReview(review1);
        flipkart.addReview(review2);
        flipkart.addReview(review3);
        flipkart.addReview(review4);
        flipkart.addReview(review5);

        while (true) {

            System.out.println("\n===== FLIPKART MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Update Product");
            System.out.println("4. Sort Products");
            System.out.println("5. Delete Product");
            System.out.println("6. Search Product");
            System.out.println("7. Add Review");
            System.out.println("8. Display Reviews");
            System.out.println("9. Search Review By Product Name");
            System.out.println("10. Update Review");
            System.out.println("11. Sort Reviews By Review ID");
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
                
                case 7:

                    System.out.print("Enter Review ID: ");
                    String reviewId = sc.nextLine();

                    System.out.print("Enter Product ID: ");
                    String productId = sc.nextLine();

                    Product foundProduct = flipkart.getProductById(productId);

                    if(foundProduct == null){   
                    System.out.println("Product not found.");
                    break;
                    }

                    System.out.print("Enter Comment: ");
                    String comment = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    int rating = sc.nextInt();
                    sc.nextLine();

                    Review review =  new Review(
                                    reviewId,
                                    foundProduct.getProductId(),
                                    comment,
                                    rating);

                        flipkart.addReview(review);
                        break;
                    
                case 8:

                    flipkart.displayAllReviews();
                    break;

                case 9:
                    System.out.print("Enter Product ID to search reviews: ");
                     String productName = sc.nextLine();

                    flipkart.searchReview(productName);
                    break;

                case 10:

                    System.out.print("Enter Review ID: ");
                    String updateReviewId = sc.nextLine();

                    System.out.print("Enter New Comment: ");
                    String newComment = sc.nextLine();

                    System.out.print("Enter New Rating: ");
                    int newRating = sc.nextInt();
                    sc.nextLine();

                    flipkart.updateReview(
                            updateReviewId,
                            newComment,
                            newRating
                            );

                            break;
                case 11:
                    List<Review> sortedReviews =
                        flipkart.sortReviewsById();

                    for(Review sortedReview : sortedReviews){
                    System.out.println(sortedReview);
                    }
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
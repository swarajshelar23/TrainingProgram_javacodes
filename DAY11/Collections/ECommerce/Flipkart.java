package DAY11.Collections.ECommerce;

import java.util.*;
public class Flipkart {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Review> reviews = new ArrayList<>();


    public Product getProductById(String productId) {

    for (Product product : products) {

        if (product.getProductId().equals(productId)) {
            return product;
        }
    }

    return null;
    }




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


    void addReview(Review review) {
        reviews.add(review);
        System.out.println("Review added successfully.");
    }


    void searchReview(String productId) {
        System.out.println("Searching reviews for Product ID: [" + productId + "]");

        boolean found = false;
        for (Review review : reviews) {
            System.out.println("Checking review: [" + review.getReviewId() + "] for Product ID: [" + review.getProductId() + "]");

            if (review.getProductId().equals(productId)) {
                System.out.println("Review found: " + review);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No reviews found for Product ID: " + productId);
        }

    }

    void displayAllReviews(){
        if (reviews.isEmpty()) {
            System.out.println("No reviews available.");
            return;
        }

        for (Review review : reviews) {
            System.out.println(review);
        }
    }

    void updateReview(String reviewId, String newComment, int newRating){

        for(Review review : reviews){

            if(review.getReviewId().equals(reviewId)){

            review.setComment(newComment);
            review.setRating(newRating);

            System.out.println("Review updated.");
            return;
                }
            }
            System.out.println("Review not found.");
        }

    void deleteReview(String reviewId){

        for(Review review : reviews){

            if(review.getReviewId().equals(reviewId)){

                reviews.remove(review);
                System.out.println("Review deleted.");
                return;
            }
        }
        System.out.println("Review not found.");

    }

    public List<Review> sortReviewsById() {

    Collections.sort(reviews, new Comparator<Review>() {
        @Override
            public int compare(Review r1, Review r2) {
                return r1.getReviewId().compareTo(r2.getReviewId());
            }
            });

            return reviews;
        }


}

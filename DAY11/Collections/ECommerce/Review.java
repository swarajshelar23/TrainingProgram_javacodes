package DAY11.Collections.ECommerce;

public class Review {
    private String reviewId;
    private String productId;
    private String Comment;
    private int rating;

    public Review(String reviewId, String productId, String Comment, int rating) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.Comment = Comment;
        this.rating = rating;
    }
    
    public String getReviewId() {
        return reviewId;
    }

    public String getProductId() {
        return productId;
    }

    public String getComment() {
        return Comment;
    }

    public int getRating() {
        return rating;
    }

    public void setComment(String Comment){
    this.Comment = Comment;
    }

    public void setRating(int rating){
    this.rating = rating;
    }
    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", productId='" + productId + '\'' +
                ", Comment='" + Comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}

package DAY9.librayManagement;



public class Book {

    private static int nextId = 1;
    private static int totalBooks = 0;

    int id;
    String name;
    String authorName;
    String category;
    double price;
    int availableCopies;

    public Book(String name, String authorName, String category,
                double price, int availableCopies) {

        // Auto-generated ID
        this.id = nextId++;

        // Default Book Name
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown Book";
        } else {
            this.name = name;
        }

        // Remove extra spaces
        this.authorName = authorName.trim();

        // Price validation
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

        // Available copies validation
        if (availableCopies < 0) {
            this.availableCopies = 0;
        } else {
            this.availableCopies = availableCopies;
        }

        this.category = category;

        totalBooks++;
    }

    // Display Book Details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + authorName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("-------------------------");
    }

    // Borrow Book
    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(name + " borrowed successfully.");
        } else {
            System.out.println(name + " is not available.");
        }
    }

    // Return Book
    public void returnBook() {
        availableCopies++;
        System.out.println(name + " returned successfully.");
    }

    // Check Availability
    public boolean isAvailable() {
        return availableCopies > 0;
    }

    // Update Price
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
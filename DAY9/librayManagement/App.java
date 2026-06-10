package DAY9.librayManagement;

import java.util.Locale.Category;

public class App {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        
        // Test Case 1: Normal book addition
        System.out.println("=== Adding Books with Validations ===\n");
        library.addBook("Java Programming", "  John Doe  ", Category.COMPUTER_HARDWARE, 599.99, 5);
        
        // Test Case 2: Book with null name -> "Unknown Book"
        library.addBook(null, "Author Name", Category.COMPUTER_HARDWARE, 299.99, 3);
        
        // Test Case 3: Book with empty name -> "Unknown Book"
        library.addBook("", "Jane Smith", Category.COMPUTER_HARDWARE, 399.99, 2);
        
        // Test Case 4: Negative price -> becomes 0
        library.addBook("Python Guide", "Bob Johnson", Category.COMPUTER_HARDWARE, -100, 4);
        
        // Test Case 5: Negative available copies -> becomes 0
        library.addBook("C++ Basics", "Alice Brown", Category.COMPUTER_HARDWARE, 450.50, -5);
        
        // Test Case 6: Book with extra spaces in author name
        library.addBook("Web Development", "   Chris Wilson   ", Category.COMPUTER_HARDWARE, 550.75, 6);
        
        // Display all books
        library.displayAllBooks();
        
        // Show total book count
        System.out.println("\nTotal Books in Library: " + library.getBookCount());
    }
}

package DAY9.librayManagement;

public class LibraryManagement {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Java Programming",
                " Pankaj Jalote ",
                "Programming",
                500,
                10);

        Book b2 = new Book(
                "Java Complete Reference",
                " Herbert Schildt ",
                "Programming",
                800,
                5);

        Book b3 = new Book(
                "Python Basics",
                " Pankaj ",
                "Programming",
                300,
                8);

        Book b4 = new Book(
                "",
                " Unknown Author ",
                "General",
                -100,
                -5);

        Book books[] = {b1, b2, b3, b4};

        // Display Books
        for (Book b : books) {
            b.display();
        }

        // 1. Costliest Book
        Book costliest = books[0];

        for (Book b : books) {
            if (b.price > costliest.price) {
                costliest = b;
            }
        }

        System.out.println("Costliest Book : " + costliest.name);

        // 2. Cheapest Book
        Book cheapest = books[0];

        for (Book b : books) {
            if (b.price < cheapest.price) {
                cheapest = b;
            }
        }

        System.out.println("Cheapest Book : " + cheapest.name);

        // 3. Count Books starting with "Java"
        int javaCount = 0;

        for (Book b : books) {
            if (b.name.startsWith("Java")) {
                javaCount++;
            }
        }

        System.out.println("Books starting with Java : " + javaCount);

        // 4. Count Books written by Pankaj
        int pankajCount = 0;

        for (Book b : books) {
            if (b.authorName.toLowerCase().contains("pankaj")) {
                pankajCount++;
            }
        }

        System.out.println("Books by Pankaj : " + pankajCount);

        // 5. Total Inventory
        int totalInventory = 0;

        for (Book b : books) {
            totalInventory += b.availableCopies;
        }

        System.out.println("Total Inventory : " + totalInventory);

        // Borrow & Return
        b1.borrowBook();
        b1.returnBook();

        System.out.println("Total Books Created : "
                + Book.getTotalBooks());
    }
}
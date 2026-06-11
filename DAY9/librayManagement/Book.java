package Day9.Practice;

class Book {

    private static int counter = 1000;

    private int id;
    private String name;
    private String author;
    private String category;
    private double price;
    private int copies;

    Book(String name,
            String author,
            String category,
            double price,
            int copies) {

        this.id = ++counter;

        this.name = name.trim().isEmpty() ? "Unknown Book" : name.trim();

        this.author = author.trim().isEmpty() ? "Unknown Author" : author.trim();

        this.category = category;

        this.price = Math.max(price, 0);

        this.copies = Math.max(copies, 0);

    }

    void display() {

        System.out.println(id + " "
                + name + " "
                + author + " "
                + price + " "
                + copies);
    }

    boolean isAvailable() {

        return copies > 0;

    }

    void borrowBook() {

        if (copies > 0) {

            copies--;

        }
    }

    void returnBook() {

        copies++;

    }

    void updatePrice(double price) {

        if (price >= 0)

            this.price = price;

    }

    double inventoryValue() {

        return price * copies;

    }

    String getName() {

        return name;

    }

    String getAuthor() {

        return author;

    }

    double getPrice() {

        return price;

    }

}
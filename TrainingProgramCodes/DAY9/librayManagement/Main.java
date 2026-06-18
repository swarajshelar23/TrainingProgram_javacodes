package DAY9.librayManagement;

public class Main {

    public static void main(String[] args) {
        Book arr[] = {

                new Book("Java Master",
                        " Robert Martin ",
                        "Programming",
                        700,
                        10),

                new Book("Python",
                        "Guido",
                        "Programming",
                        600,
                        15),

                new Book("Java DSA",
                        "Martin Fowler",
                        "DSA",
                        800,
                        5)

        };

        double max = arr[0].getPrice();

        double min = arr[0].getPrice();

        int javaCount = 0;

        int martinCount = 0;

        double total = 0;

        for (Book b : arr) {

            if (b.getPrice() > max)

                max = b.getPrice();

            if (b.getPrice() < min)

                min = b.getPrice();

            if (b.getName().startsWith("Java"))

                javaCount++;

            if (b.getAuthor().contains("Martin"))

                martinCount++;

            total += b.inventoryValue();

        }

        System.out.println(max);

        System.out.println(min);

        System.out.println(javaCount);

        System.out.println(martinCount);

        System.out.println(total);

    }

}
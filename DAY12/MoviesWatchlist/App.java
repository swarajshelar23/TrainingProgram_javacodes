package DAY12.MoviesWatchlist;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Watchlist watchList = new Watchlist();

        // Add movies
        watchList.addMovie("Inception");
        watchList.addMovie("Dark");
        watchList.addMovie("Money Heist");

        // Add multiple movies
        watchList.addMovies(Arrays.asList(
                "Breaking Bad",
                "Dark",
                "Stranger Things",
                "Inception"
        ));

        // Display all
        watchList.displayMovies();

        // // Display duplicates
        // watchList.displayDuplicates();

        // // Count keyword
        // System.out.println("\nMovies containing 'in': "
        //         + watchList.countMoviesContaining("in"));

        // // Movies starting with D
        // watchList.displayMoviesStartingWith('D');

        // // Replace movie
        // watchList.replaceMovie(2, "Narcos");

        // // Sort
        // watchList.sortMovies();

        // watchList.displayMovies();

        // // Reverse order
        // watchList.displayReverse();

        // // Remove duplicates
        // watchList.removeDuplicates();

        // watchList.displayMovies();

        // // Remove movie
        // watchList.removeMovie("Narcos");

        // watchList.displayMovies();
    }
}
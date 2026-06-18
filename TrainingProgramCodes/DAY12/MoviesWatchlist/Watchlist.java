package DAY12.MoviesWatchlist;

import java.util.*;

public class Watchlist {
        private ArrayList<Movies> movies = new ArrayList<>();
        private boolean isValidtitle(String name) {
        return name != null && !name.trim().isEmpty();
        }

        public void addMovie(String name) {
        if (!isValidtitle(name)) {
            System.out.println("Invalid movie name.");
            return;
        }

        movies.add(new Movies(name, "", 0));
        System.out.println("Movie added to watchlist: " + name);

        }

        public void addMovies(List<String> movieNames) {
        for (String name : movieNames) {
            if (isValidtitle(name)) {
                movies.add(new Movies(name, "", 0   ));
                }
            }
        }

        public void removeMovie(String name) {
        Iterator<Movies> iterator = movies.iterator();

        while (iterator.hasNext()) {
            Movies movie = iterator.next();

            if (movie.getTitle().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println(name + " removed.");
                return;
                }
            }
            System.out.println("Movie not found.");
        }

        public void replaceMovie(int position, String newMovie) {

        if (!isValidtitle(newMovie)) {
            System.out.println("Invalid movie name.");
            return;
            }

        if (position < 0 || position >= movies.size()) {
            System.out.println("Invalid replacement position.");
            return;
            }

        movies.set(position, new Movies(newMovie, "", 0));
        System.out.println("Movie replaced successfully.");
        }

        public void displayMovies(){

            if (movies.isEmpty()) {
                System.out.println("Watchlist is empty.");
                return;
            }
            System.out.println("Movies in Watchlist:");
            for (Movies movie : movies) {
                System.out.println(movie.getTitle());
            }
        }

         public void displayReverse() {

        if (movies.isEmpty()) {
            System.out.println("Watchlist is empty.");
            return;
        }

        System.out.println("\nReverse Watchlist:");

        for (int i = movies.size() - 1; i >= 0; i--) {
            System.out.println(movies.get(i));
        }
    }

    // Sort alphabetically
    public void sortMovies() {

        movies.sort((m1, m2) ->
                m1.getTitle().compareToIgnoreCase(m2.getTitle()));

        System.out.println("Movies sorted.");
    }

    // Movies starting with character
    public void displayMoviesStartingWith(char ch) {

        boolean found = false;

        System.out.println("\nMovies starting with '" + ch + "':");

        for (Movies movie : movies) {

            if (!movie.getTitle().isEmpty() &&
                Character.toLowerCase(movie.getTitle().charAt(0))
                        == Character.toLowerCase(ch)) {

                System.out.println(movie);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No movies found.");
        }
    }

    // Count movies containing keyword
    public int countMoviesContaining(String keyword) {

        int count = 0;

        for (Movie movie : movies) {

            if (movie.getName().toLowerCase()
                    .contains(keyword.toLowerCase())) {

                count++;
            }
        }

        return count;
    }

    // Display duplicates
    public void displayDuplicates() {

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (Movie movie : movies) {

            String name = movie.getName().toLowerCase();

            if (!seen.add(name)) {
                duplicates.add(movie.getName());
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate movies.");
            return;
        }

        System.out.println("\nDuplicate Movies:");

        for (String movie : duplicates) {
            System.out.println(movie);
        }
    }

    // Remove duplicates while preserving order
    public void removeDuplicates() {

        Set<String> seen = new HashSet<>();
        ArrayList<Movies> uniqueMovies = new ArrayList<>();

        for (Movies movie : movies) {

            String name = movie.getTitle().toLowerCase();

            if (seen.add(name)) {
                uniqueMovies.add(movie);
            }
        }

        movies = uniqueMovies;

        System.out.println("Duplicates removed.");
    }
}


    
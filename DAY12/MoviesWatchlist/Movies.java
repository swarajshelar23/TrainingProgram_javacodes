package DAY12.MoviesWatchlist;

public class Movies {
    private String title;
    private String genre;
    private int releaseYear;
    public Movies(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }
    public String setGenre(String genre) {
        this.genre = genre;
        return genre;
    }
    public int setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return releaseYear;
    }

    public String toString() {
        return "Movies [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + "]";
    }
    
}

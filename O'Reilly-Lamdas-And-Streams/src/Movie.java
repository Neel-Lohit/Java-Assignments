public class Movie {
    private String movieName;
    private int rating;
    private String director;

    public Movie(String movieName, int rating, String director) {
        this.movieName = movieName;
        this.rating = rating;
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }
    @Override
    public String toString()
    {
        return movieName;
    }
}

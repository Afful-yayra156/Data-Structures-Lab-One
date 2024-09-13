public class Movie {
    public String title;
    public int releaseYear;
    public double rating;

    public Movie() {

    }

    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // accessor methods
    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public double getRating() {
        return this.rating;
    }

    // mutator methods
    public void setTitle(String movieTitle) {
        this.title = movieTitle;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString method to display the details of the movie to a string format(the
    // integers)
    public String toString() {
        return "Movie Name: " + getTitle() + ": It was released in " + Integer.toString(releaseYear)
                + " and it has a rating of " + Double.toString(rating);
    }
}

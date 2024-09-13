public class MovieListApplication {
    public static void main(String[] args) {
        // using the CustomArrayList to store various movie objects
        CustomArrayList listOfMovies = new CustomArrayList();

        // adding new movies to the list
        listOfMovies.add(new Movie("Damsel", 2024, 4.1));
        listOfMovies.add(new Movie("The Kitchen", 2023, 2.5));
        listOfMovies.add(new Movie("How To Ruin Christmas", 2023, 4.8));
        listOfMovies.add(new Movie("Hunger", 2023, 4.1));
        listOfMovies.add(new Movie("The Woman King", 2022, 4.5));
        listOfMovies.add(new Movie("Avatar: The Last Airbender", 2024, 4.9));
        listOfMovies.add(new Movie("The Woman King", 2022, 4.5));

        // displaying all the mobies in the list with their details
        System.out.println("The movies currently in the list are: ");
        for (int index = 0; index < listOfMovies.size(); index++) {
            System.out.println(listOfMovies.get(index));
            System.out.println();
        }

        // calculating the average rating of all movies in the list using an enhanced
        // for loop
        double allRatings = 0;
        for (int i = 0; i < listOfMovies.size(); i++) {
            allRatings += ((Movie) listOfMovies.get(i)).getRating();
        }
        double averageRating = allRatings / listOfMovies.size();
        System.out.println("The average rating of all the movies in the list is: " + averageRating);
        System.out.println();
        System.out.println();

        // removing a movie from the list by title
        String movieToRemove = "Hunger";
        boolean removedMovie = false;
        for (int i = 0; i < listOfMovies.size(); i++) {
            Movie movie = (Movie) listOfMovies.get(i);
            if (movie.getTitle().equals(movieToRemove)) {
                listOfMovies.removee(i);
                System.out.println(
                        "The movie titled " + " '" + movieToRemove + "' " + " has been removed from the list.");
                removedMovie = true;
                break;
            }
        }
        if (!removedMovie) {
            System.out.println("The movie titled " + movieToRemove + " was not found in the list");
        }
        System.out.println();

        // removing two movies that have the same title
        String movieToRemove2 = "The Woman King";
        boolean removedMovie2 = false;
        for (int i = 0; i < listOfMovies.size(); i++) {
            Movie movie = (Movie) listOfMovies.get(i);
            if (movie.getTitle().equals(movieToRemove2)) {
                listOfMovies.removee(i);
                System.out.println(
                        "The movie titled " + " '" + movieToRemove2 + "' " + " has been removed from the list.");
                removedMovie2 = true;
            }
        }
        if (!removedMovie2) {
            System.out.println("The movie titled " + movieToRemove2 + " was not found in the list");
        }
        System.out.println();
    }
}
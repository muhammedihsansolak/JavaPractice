package coreJavaPractice.day31_Practice.Movie;

public class MovieObjects {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Norway","Swift with joy","01.09.2023","Maxwell Ian");

        myMovie.addCast("Muhammed");

        String[] cast = {"Hülya", "Zehra"};
        myMovie.addCasts(cast);

        myMovie.genre = "Comedy, Adventure";

        System.out.println(myMovie);
    }
}

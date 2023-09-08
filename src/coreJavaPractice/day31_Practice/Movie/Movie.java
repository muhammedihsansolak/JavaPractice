package coreJavaPractice.day31_Practice.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String addCast){
        casts.add(addCast);
    }
    public void addCasts(String[] addCasts){
        casts.addAll(Arrays.asList(addCasts));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}

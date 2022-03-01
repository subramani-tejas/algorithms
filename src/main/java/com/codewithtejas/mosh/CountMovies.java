package com.codewithtejas.mosh;

import java.util.ArrayList;
import java.util.List;

public class CountMovies {
    public static int getCountImperative(List<Movie> movies) {
        int count = 0;
        for (Movie movie : movies)
            if (movie.getLikes() > 10) count++;

        return count;
    }

    public static int getCountFunctional(List<Movie> movies) {
        return (int) movies.stream().filter(movie -> movie.getLikes() > 10).count();
    }

    public static List<String> getMovieNames(List<Movie> movies) {
        List<String> movieNames = new ArrayList<>();
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> movieNames.add(name));
        return movieNames;
    }
}

class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }
}

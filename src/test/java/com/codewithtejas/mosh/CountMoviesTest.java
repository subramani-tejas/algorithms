package com.codewithtejas.mosh;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CountMoviesTest {
    List<Movie> movies = List.of(
            new Movie("Monsters Inc", 12),
            new Movie("B", 19),
            new Movie("C", 2),
            new Movie("D", 29),
            new Movie("Spiderman: No Way Home", 191),
            new Movie("F", 4),
            new Movie("G", 7)
    );

    @Test
    public void getCountImperativeTest() {
        int expected = 4;
        int actual = CountMovies.getCountImperative(movies);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountFunctionalTest() {
        int expected = 4;
        int actual = CountMovies.getCountFunctional(movies);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMovieNamesTest() {
        List<String> expected = Arrays.asList("Monsters Inc", "B", "C", "D", "Spiderman: No Way Home", "F", "G");
        List<String> actual = CountMovies.getMovieNames(movies);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}

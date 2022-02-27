package com.codewithtejas.random;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JoinListsWithoutDuplicatesTest<T> {

    @Test
    public void testCharacters() {
        List<Character> one = Arrays.asList('a', 'b', 'c', 'd', 'e');
        List<Character> two = Arrays.asList('b', 'd', 'f', 'g');

        List<Character> expected = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g');
        List<T> actual = new JoinListsWithoutDuplicates().join(one, two);

        Assert.assertEquals(expected, actual);
        System.out.println("Works for Characters!");
    }

    @Test
    public void testIntegers() {
        List<Integer> one = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> two = Arrays.asList(3, 5, 6, 7);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<T> actual = new JoinListsWithoutDuplicates().join(one, two);

        Assert.assertEquals(expected, actual);
        System.out.println("Works for Integers!");
    }
}

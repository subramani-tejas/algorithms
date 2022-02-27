package com.codewithtejas.random;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MergeSortedListsTest {

    @Test
    public void test1() {
        List<Integer> listOne = Arrays.asList(3, 7, 9, 12, 21);
        List<Integer> listTwo = Arrays.asList(6, 8, 15, 18, 27);

        List<Integer> expected = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 18, 21, 27);
        List<Integer> actual = MergeTwoSortedLists.merge(listOne, listTwo);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        List<Integer> listOne = Arrays.asList(3, 7, 9, 12, 21);
        List<Integer> listTwo = Arrays.asList(6, 8, 15, 18, 27);

        List<Integer> expected = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 18, 21, 27);
        List<Integer> actual = MergeTwoSortedLists.merge(listOne, listTwo);

        Assert.assertEquals(expected, actual);
    }
}

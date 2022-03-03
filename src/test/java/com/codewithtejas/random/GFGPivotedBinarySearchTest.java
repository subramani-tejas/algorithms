package com.codewithtejas.random;

import org.junit.Assert;
import org.junit.Test;

public class GFGPivotedBinarySearchTest {

    @Test
    public void pivotedSearchTest1() {
        int[] arr = {3, 4, 5, 1, 2};
        int k = 1;
        int expected = 3;
        int actual = GFGPivotedBinarySearch.pivotedSearch(arr, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pivotedSearchTest2() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k = 3;
        int expected = 8;
        int actual = GFGPivotedBinarySearch.pivotedSearch(arr, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pivotedSearchTest3() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k = 30;
        int expected = -1;
        int actual = GFGPivotedBinarySearch.pivotedSearch(arr, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pivotedSearchTest4() {
        int[] arr = {30, 40, 50, 10, 20};
        int k = 10;
        int expected = 3;
        int actual = GFGPivotedBinarySearch.pivotedSearch(arr, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchTest() {
        int[] arr = {5, 6, 7, 8, 9, 10};
        int k = 8;
        int expected = 3;
        int actual = GFGPivotedBinarySearch.binarySearch(arr, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPivotIndexTest() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int expected = 5;
        int actual = GFGPivotedBinarySearch.findPivotIndex(arr);
        Assert.assertEquals(expected, actual);
    }
}

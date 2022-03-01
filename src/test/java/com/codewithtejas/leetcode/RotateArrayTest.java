package com.codewithtejas.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void rotateRightTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {4, 5, 1, 2, 3};
        int[] actual = RotateArray.rotateRight(arr, k);
        Assert.assertArrayEquals(expected, actual);
        System.out.println("Right rotate works.");
    }

    @Test
    public void rotateLeftTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {3, 4, 5, 1, 2};
        int[] actual = RotateArray.rotateLeft(arr, k);
        Assert.assertArrayEquals(expected, actual);
        System.out.println("Left rotate works.");
    }
}

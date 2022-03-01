package com.codewithtejas.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class KthMissingPositiveNumberTest {

    @Test
    public void testWithinRange() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int expected = 9;
        int actual = KthMissingPositiveNumber.findKthMissingNumber(arr, k);

        Assert.assertEquals(expected, actual);
        System.out.println("Works for 'k' within range.");
    }

    @Test
    public void testOutOfRange() {
        int[] arr = {2001, 2002};
        int k = 2002;

        int expected = 2004;
        int actual = KthMissingPositiveNumber.findKthMissingNumber(arr, k);

        Assert.assertEquals(expected, actual);
        System.out.println("Works for 'k' out of range.");
    }

    @Test
    public void testNothingMissing() {
        int[] arr = {1,2,3,4,5};
        int k = 5;

        int expected = 10;
        int actual = KthMissingPositiveNumber.findKthMissingNumber(arr, k);

        Assert.assertEquals(expected, actual);
        System.out.println("Works if nothing is missing.");
    }
}

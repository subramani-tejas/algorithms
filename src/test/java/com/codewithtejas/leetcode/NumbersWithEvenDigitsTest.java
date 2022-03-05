package com.codewithtejas.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class NumbersWithEvenDigitsTest {

    @Test
    public void getEvenDigitCountTest() {
        int[] nums = {12, 345, 29, 6, 7896};
        int expected = 3;
        int actual = NumbersWithEvenDigits.getEvenDigitCount(nums);
        Assert.assertEquals(expected, actual);
        System.out.println("getEvenDigitCount() works.");
    }

    @Test
    public void getEvenDigitCountTestWithNegativeNumbers() {
        int[] nums = {12, -345, 29, 6, -7896, 69};
        int expected = 4;
        int actual = NumbersWithEvenDigits.getEvenDigitCount(nums);
        Assert.assertEquals(expected, actual);
        System.out.println("getEvenDigitCount() works for negative numbers.");
    }

    @Test
    public void getNumberOfDigitsTest() {
        int num = 12334;
        int expected = 5;
        int actual = NumbersWithEvenDigits.getNumberOfDigits(num);
        Assert.assertEquals(expected, actual);
        System.out.println("getNumberOfDigits() works.");
    }

    @Test
    public void getNumberOfDigitsUsingLogTest() {
        int num = 12334;
        int expected = 5;
        int actual = NumbersWithEvenDigits.getNumberOfDigitsUsingLog(num);
        Assert.assertEquals(expected, actual);
        System.out.println("getNumberOfDigitsUsingLog() works");
    }
}

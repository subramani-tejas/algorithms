package com.codewithtejas.abAlgorithms;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class SearchTest {

    @Test
    public void TestCase1() {
        List<Integer> input = Arrays.asList(3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62);
        int target = 42;
        int expectedOutput = 10;
        int actualOutput = Search.binarySearchIterative(input, target);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase2() {
        List<Integer> input = Arrays.asList(0, 1, 21, 33, 45, 45, 61, 71, 72, 73);
        int target = 72;
        int expectedOutput = 8;
        int actualOutput = Search.binarySearchRecursive(input, target);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase3() {
        List<Integer> input = Arrays.asList(0, 1, 21, 33, 45, 45, 61, 71, 72, 73);
        int target = 99;
        int expectedOutput = -1;
        int actualOutput = Search.binarySearchRecursive(input, target);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
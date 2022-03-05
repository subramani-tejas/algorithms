package com.codewithtejas.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {

    @Test
    public void maximumWealthTest() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int expected = 17;
        int actual = RichestCustomerWealth.maximumWealth(accounts);
        Assert.assertEquals(expected, actual);
    }
}

// https://leetcode.com/problems/richest-customer-wealth/

package com.codewithtejas.leetcode;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {

        int maxWealth = Integer.MIN_VALUE;

        for (int[] customer : accounts) {
            int sumOfMoney = 0;
            for (int moneyInBank : customer)
                sumOfMoney += moneyInBank;

            if (maxWealth < sumOfMoney)
                maxWealth = sumOfMoney;
        }

        return maxWealth;
    }
}
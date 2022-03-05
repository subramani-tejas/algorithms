//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.codewithtejas.leetcode;

public class NumbersWithEvenDigits {

    public static int getEvenDigitCount(int[] nums) {
        int count = 0;
        for (int element : nums)
            if (getNumberOfDigits(element) % 2 == 0)
                count++;

        return count;
    }

    public static int getNumberOfDigitsUsingLog(int num) {
        if (num == 0) return 1;
        return (int) (Math.log10(num) + 1);
    }

    public static int getNumberOfDigits(int num) {
        if (num == 0) return 1;
        if (num < 0) num = num * -1;

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}

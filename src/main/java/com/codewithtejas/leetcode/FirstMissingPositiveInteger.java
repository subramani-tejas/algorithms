package com.codewithtejas.leetcode;

import java.util.Arrays;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4};
        int ans = findFirstMissingInteger(arr);
        System.out.println(ans);
    }

    public static int findFirstMissingInteger(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i <= max; i++) {
            arr[i] = i;
        }

        return max + 1;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int element : arr) {
            if (max < element) max = element;
        }

        return max;
    }
}

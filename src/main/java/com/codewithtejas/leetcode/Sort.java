package com.codewithtejas.leetcode;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else i++;
        }
        return arr;
    }

    public static int[] selectionSort(int[] nums) {
        // selection sort
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int lastIndex = n - 1 - i;
            int maxIndex = findMaxIndex(nums, lastIndex);

            if (maxIndex != lastIndex)
                swap(nums, maxIndex, lastIndex);
        }
        return nums;
    }

    public static int findMaxIndex(int[] nums, int end) {
        int maxIndex = 0;

        for (int i = 0; i <= end; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

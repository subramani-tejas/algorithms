// https://leetcode.com/problems/missing-number/submissions/

package com.codewithtejas.leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2001, 2002};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0, n = nums.length;

        // will sort the array
        while (i < n) {
            int correctIndex = nums[i];
            if (nums[i] < n && nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else i++;
        }

        // check which index is missing
        for (int j = 0; j < n; j++)
            if (nums[j] != j) return j;

        return n;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

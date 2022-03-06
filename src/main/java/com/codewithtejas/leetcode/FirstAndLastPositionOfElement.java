package com.codewithtejas.leetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    // brute force - O(N)
    public static int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int[] index = new int[2];
        boolean isLoDone = false, isHiDone = false;

        while (lo < nums.length) {
            if (!isLoDone) {
                if (nums[lo] == target) {
                    index[0] = lo;
                    isLoDone = true;
                }
            }

            if (!isHiDone) {
                if (nums[hi] == target) {
                    index[1] = hi;
                    isHiDone = true;
                }
            }
            lo++;
            hi--;
        }

        if (isLoDone && isHiDone) {
            return index;
        } else return new int[]{-1, -1};
    }
}

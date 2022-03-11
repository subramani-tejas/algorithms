// https://leetcode.com/problems/find-all-duplicates-in-an-array/

package com.codewithtejas.leetcode;

import java.util.ArrayList;
import java.util.List;

// cyclic sort (range 1 -> n)
public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0, n = nums.length;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else i++;
        } // array is sorted

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (nums[j] != j + 1) list.add(nums[j]);

        return list;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

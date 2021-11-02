package com.codewithtejas.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static int[] containsTargetSum(int[] array, int targetSum) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < i; j++)
                if ((array[i] + array[j]) == targetSum) {
                    list.add(array[i]);
                    list.add(array[j]);
                }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            resultArray[i] = list.get(i);

        return resultArray;
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] results = new int[array.length];
        for (int i = 0; i < array.length; i++){
            results[i] = array[i] * array[i];
        }
        Arrays.sort(results);
        return results;
    }

    public static void main(String[] args) {
        int[] array = {-21, 210, -47, 162, 1};
        int targetSum = 163;

        var result = TwoSum.containsTargetSum(array, targetSum);
        // System.out.println(Arrays.toString(result));

        // sorted squared array
        int[] array2 = {-3, -2, -1};
        var result2 = TwoSum.sortedSquaredArray(array2);
        System.out.println(Arrays.toString(result2));
    }
}

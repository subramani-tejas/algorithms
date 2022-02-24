// https://www.educative.io/m/sum-of-two-values

package com.codewithtejas.educativeio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSum {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 2, 8, 4, 3, 6};
        int val = 11;
        System.out.println(findSumOfTwo(array, val));
    }

    // O(n) time
    public static boolean findSumOfTwo(int[] array, int val) {
        Set<Integer> set = new HashSet<>();
        boolean result = false;
        List<List<Integer>> finalPairs = new ArrayList<>();
        for (int element : array) {
            if (set.contains(val - element)) {
                result = true;
                List<Integer> pairs = new ArrayList<>();
                pairs.add(element);
                pairs.add(val - element);
                finalPairs.add(new ArrayList<>(pairs));
            }
            set.add(element);
        }
        System.out.println(finalPairs);
        return result;
    }

    // O(n) * O(n)
    /*public static boolean findSumOfTwo(int[] array, int val) {
        int count = 0;
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == val) {
                    System.out.println(array[i] + " + " + array[j]);
                    count++;
                    result = true;
                }
            }
        }
        System.out.println("Count: " + count);
        return result;
    }*/
}

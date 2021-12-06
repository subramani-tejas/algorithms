package com.codewithtejas.abAlgorithms;

import java.util.List;

public class Search {
    public static int binarySearchIterative(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) == target) return mid;
            else if (target < list.get(mid)) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(List<Integer> list, int target) {
        return binarySearchRecursive(list, target, 0, list.size() - 1);
    }

    public static int binarySearchRecursive(List<Integer> list, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (list.get(mid) == target) return mid;
        else if (target < list.get(mid)) return binarySearchRecursive(list, target, low, mid - 1);
        else return binarySearchRecursive(list, target, mid + 1, high);
    }
}
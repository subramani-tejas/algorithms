package com.codewithtejas.leetcode;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,11,14,16,17,19,20,21,22,23,25,26,27,35};
        int target = 16;
        System.out.println("Target found at index: " + search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int lo = 0, hi = 1;
        while (target > arr[hi]) {
            int newLo = hi + 1;
            hi = hi + (hi - lo + 1) * 2;
            lo = newLo;
        }
        System.out.println("Window:");
        System.out.println("Index: " + lo + " number: " + arr[lo]);
        System.out.println("Index: " + hi + " number: " + arr[hi]);
        System.out.println("====================");

        return search(arr, target, lo, hi);
    }

    public static int search(int[] arr, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}

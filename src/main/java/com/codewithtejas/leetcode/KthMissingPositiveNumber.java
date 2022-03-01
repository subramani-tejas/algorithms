package com.codewithtejas.leetcode;

public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println("Ans: " + KthMissingPositiveNumber.findKthMissingNumberOptimized(arr, k));
    }

    // O(logN)
    public static int findKthMissingNumberOptimized(int[] arr, int k) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            System.out.println(mid);
            if (arr[mid] - (mid + 1) >= k) r = mid;
            else l = mid + 1;
        }

        return l + k;
    }

    // O(n)
    public static int findKthMissingNumber(int[] arr, int k) {
        for (int element : arr)
            if (element <= k) k++;
            else break;

        return k;
    }
}

package com.codewithtejas.random;

public class GFGPivotedBinarySearch {

    /* algorithm */
    public static int pivotedSearch(int[] arr, int k) {
        int pivot = findPivotIndex(arr);

        // no pivot
        if (pivot == -1) return binarySearch(arr, k);

        // compare k with pivot and search around it
        if (arr[pivot] == k) return pivot;
        if (arr[0] <= k) return binarySearch(arr, k, 0, pivot - 1);
        return binarySearch(arr, k, pivot + 1, arr.length - 1);
    }

    /* find index of pivot point */
    public static int findPivotIndex(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        return findPivotIndex(arr, lo, hi);
    }

    public static int findPivotIndex(int[] arr, int lo, int hi) {
        if (hi < lo) return -1;
        if (hi == lo) return lo;

        int mid = lo + (hi - lo) / 2;

        if (mid < hi && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > lo && arr[mid] < arr[mid - 1])
            return mid - 1;
        if (arr[lo] >= arr[mid])
            return findPivotIndex(arr, lo, mid - 1);
        return findPivotIndex(arr, mid + 1, hi);
    }

    /* regular binary search */
    public static int binarySearch(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;
        return binarySearch(arr, k, lo, hi);
    }

    public static int binarySearch(int[] arr, int k, int lo, int hi) {
        if (hi < lo) return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == k) return mid;
        if (k > arr[mid]) return binarySearch(arr, k, mid + 1, hi);
        return binarySearch(arr, k, lo, mid - 1);
    }
}

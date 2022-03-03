package com.codewithtejas.leetcode;

/*
 * arr = [2 3 5 9 14 16 18]
 * k = 15
 * return 16
 *
 * ceiling <- greater than or equal to the number
 *
 * */
public class CeilingOfANumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int k = 11;
        int index = getCeiling(arr, k);
        if (index >= 0)
            System.out.println("At index: " + index + " | Element: " + arr[index]);
    }

    public static int getCeiling(int[] arr, int k) {

        if (k > arr[arr.length - 1]) return -1;

        int lo = 0, hi = arr.length;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (k > arr[mid]) {
                lo = mid + 1;
            } else if (k < arr[mid]) {
                hi = mid - 1;
            } else return mid;
        }

        return lo;
    }
}

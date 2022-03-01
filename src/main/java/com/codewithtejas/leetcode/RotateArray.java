package com.codewithtejas.leetcode;

public class RotateArray {

    // O(k * n)
    public static int[] rotateRight(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                swap(arr, j, j - 1);
            }
        }
        return arr;
    }

    public static int[] rotateLeft(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

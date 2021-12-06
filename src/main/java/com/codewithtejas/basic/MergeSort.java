package com.codewithtejas.basic;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] array) {
        if (array.length < 2) return;

        var middle = array.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++)
            left[i] = array[i];

        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++)
            right[i - middle] = array[i];

        sort(left);
        sort(right);

        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] array) {
         int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

         while (leftIndex < left.length && rightIndex < right.length){
             if(left[leftIndex] <= right[rightIndex]) array[arrayIndex++] = left[leftIndex++];
             else array[arrayIndex++] = right[rightIndex++];
         }

         while (leftIndex < left.length)
             array[arrayIndex++] = left[leftIndex++];

        while (rightIndex < right.length)
            array[arrayIndex++] = right[rightIndex++];
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 9, 3, 2};
        var algorithm = new MergeSort();
        algorithm.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

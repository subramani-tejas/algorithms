package com.codewithtejas.basic;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var minIndex = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < array[minIndex]) minIndex = j;
            swap(array, minIndex, i);
        }
    }

    private void swap(int[] array, int a, int b) {
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 9, 3, 2};
        var algorithm = new SelectionSort();
        algorithm.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

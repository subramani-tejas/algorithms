package com.codewithtejas.basic;

import java.util.Arrays;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 9, 3, 2};
        var algorithm = new InsertionSort();
        algorithm.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

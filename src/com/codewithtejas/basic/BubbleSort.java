package com.codewithtejas.basic;

import java.util.Arrays;

public class BubbleSort {

    // bubble sort
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j-1]) swap(array, j, j-1);
    }

    // swap two numbers
    private void swap(int[] array, int a, int b) {
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 9, 3, 2};
        BubbleSort algorithm = new BubbleSort();
        algorithm.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

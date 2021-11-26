package com.codewithtejas.easy;

import java.util.Arrays;
import java.util.List;

public class ThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (var number : array)
            updateLargest(threeLargest, number);
        return threeLargest;
    }

    private static void updateLargest(int[] threeLargest, int number) {
        if (number > threeLargest[2]) shiftUpdate(threeLargest, number, 2);
        else if (number > threeLargest[1]) shiftUpdate(threeLargest, number, 1);
        else if (number > threeLargest[0]) shiftUpdate(threeLargest, number, 0);
    }

    private static void shiftUpdate(int[] threeLargest, int number, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) threeLargest[i] = number;
            else threeLargest[i] = threeLargest[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        System.out.println(Arrays.toString(findThreeLargestNumbers(array)));
    }
}

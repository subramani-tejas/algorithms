package com.codewithtejas.easy;

import java.util.Arrays;

/*
*               1       2     2     3       6
* wait time     0      (1)  (1+2) (1+2+2) (1+2+2+3)
* total = 17
* */
public class MinimumWaitTime {

    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        var length = queries.length;
//        if (length == 1) return 0;

        Arrays.sort(queries);
        var totalTime = 0;
        for (var i = 0; i < length - 1; i++)
            totalTime += queries[i] * (length - i - 1);
        return totalTime;
    }

    public static void main(String[] args) {
        int[] queries = {3};
        System.out.println(minimumWaitingTime(queries));
    }
}

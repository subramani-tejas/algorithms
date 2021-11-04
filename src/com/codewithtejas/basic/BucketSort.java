package com.codewithtejas.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void sort(int[] array, int numberOfBuckets) {
        var buckets = createBuckets(array, numberOfBuckets);
        System.out.println(buckets);

        int i = 0;
        for (var bucket : buckets) {
            Collections.sort(bucket);
            for (var item : bucket)
                array[i++] = item;
        }

    }

    private List<List<Integer>> createBuckets(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (var i = 0; i < numberOfBuckets; i++)
            buckets.add(new ArrayList<>());

        for (var item : array)
            buckets.get(item / numberOfBuckets).add(item);

        return buckets;
    }

    public static void main(String[] args) {
        int[] array = {8, 1, 3, 2, 5, 6, 7, 4, 10, 9};
        var algorithm = new BucketSort();
        algorithm.sort(array, 4);
        System.out.println(Arrays.toString(array));
    }
}

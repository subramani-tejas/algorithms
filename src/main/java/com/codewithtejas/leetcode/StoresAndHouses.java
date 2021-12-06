package com.codewithtejas.leetcode;

// https://leetcode.com/discuss/interview-question/350248/Google-or-Summer-Intern-OA-2019-or-Stores-and-Houses
/*
* You are given 2 arrays representing integer locations of stores and houses
* (each location in this problem is one-dimensional). For each house, find the store closest to it.
* Return an integer array result where result[i] should denote the location of
* the store closest to the i-th house. If many stores are equidistant from a particular
* house, choose the store with the smallest numerical location.
*
* Note that there may be multiple stores and houses at the same location.
*
* Example 1:
* Input: houses = [5, 10, 17], stores = [1, 5, 20, 11, 16]
* Output: [5, 11, 16]
*
* Explanation:
* The closest store to the house at location 5 is the store at the same location.
* The closest store to the house at location 10 is the store at the location 11.
* The closest store to the house at location 17 is the store at the location 16.
*
* Example 2:
* Input: houses = [2, 4, 2], stores = [5, 1, 2, 3]
* Output: [2, 3, 2]
*
* Example 3:
* Input: houses = [4, 8, 1, 1], stores = [5, 3, 1, 2, 6]
* Output: [3, 6, 1, 1]
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StoresAndHouses {

    // find the closest store
    public int[] findClosestStore(int[] houses, int[] stores) {
        Arrays.sort(stores);
        int[] result = new int[houses.length];
        Arrays.fill(result, Integer.MAX_VALUE);

        for(int i = 0; i < houses.length; i++){
            int lo = 0;
            int hi = stores.length - 1;
            while(lo <= hi){
                int middle = (lo + hi) / 2;
                if (result[i] == Integer.MAX_VALUE || Math.abs(stores[middle] - houses[i]) < Math.abs(result[i] - houses[i]))
                    result[i] = stores[middle];
                if (houses[i] < stores[middle]) hi = middle - 1;
                else  lo = middle + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] houses = {1, 2};
        int[] stores = {2, 3};

        StoresAndHouses storesAndHouses = new StoresAndHouses();
        System.out.println(Arrays.toString(storesAndHouses.findClosestStore(houses, stores)));
    }
}

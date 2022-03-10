package com.codewithtejas.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Base10ToBase2 {
    public static void main(String[] args) {
        int x = 13; // base 10
        List<Integer> remainders = new ArrayList<>();
        int quo = x / 2;
        int rem = x % 2;
        remainders.add(rem);

        while (quo > 1) {
            int temp = quo;
            quo = quo / 2;
            rem = temp % 2;
            remainders.add(rem);
        }
        remainders.add(quo);
        Collections.reverse(remainders);
        System.out.println(remainders);
    }
}

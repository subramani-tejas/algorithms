// https://leetcode.com/problems/guess-number-higher-or-lower/

package com.codewithtejas.leetcode;

public class GuessGame {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        long lo = 1, hi = n;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (guess((int) mid) == 0.0) return (int) mid;
            else if (guess((int) mid) == 1.0) lo = mid + 1;
            else if (guess((int) mid) == -1.0) hi = mid - 1;
        }
        return -1;
    }

    public static int guess(int num) {
        int pick = 6;
        if (num > pick) return -1;
        else if (num < pick) return 1;
        return 0;
    }
}

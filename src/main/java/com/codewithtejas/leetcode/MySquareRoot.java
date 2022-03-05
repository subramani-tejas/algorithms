// https://leetcode.com/problems/sqrtx/

package com.codewithtejas.leetcode;

public class MySquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
        System.out.println(isPerfectSquare(25));
    }

    public static int mySqrt(int num) {
        if (num < 2) return num == 0 ? 0 : 1;

        long start = 1, end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long potentialSquare = mid * mid;
            if (num == potentialSquare) return (int) mid;
            else if (num > potentialSquare) start = mid + 1;
            else end = mid - 1;
        }
        return (int) end;
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long s = 1, e = num;
        while (s <= e) {
            long mid = s + (e - s) / 2;
            long potentialSquare = mid * mid;
            if (num == potentialSquare) return true;
            else if (num > potentialSquare) s = mid + 1;
            else e = mid - 1;
        }
        return false;
    }
}

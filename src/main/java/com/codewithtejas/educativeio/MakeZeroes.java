// https://www.educative.io/m/make-columns-and-rows-zero

package com.codewithtejas.educativeio;

import java.util.HashSet;
import java.util.Set;

public class MakeZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{5, 4, 3, 9}, {2, 0, 7, 6}, {1, 3, 4, 0}, {9, 8, 3, 4}};
        System.out.println("Input: ");
        print(matrix);
        System.out.println("===================");
        print(makeZeroes(matrix));
    }

    // O(rows) * O(cols)
    public static int[][] makeZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }

        for (int row : zeroRows)
            for (int col = 0; col < cols; col++)
                matrix[row][col] = 0;

        for (int col : zeroCols)
            for (int row = 0; row < rows; row++)
                matrix[row][col] = 0;

        return matrix;
    }

    public static int[][] putZeroes(int[][] matrix, int i, Set<Integer> j) {
        for (int x : j)
            for (int y = 0; y < i; y++)
                matrix[x][y] = 0;

        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + "   ");
            }
            System.out.println();
        }
    }
}


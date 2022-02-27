// https://www.educative.io/m/search-matrix

package com.codewithtejas.educativeio;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 45, 80, 81},
                {6, 7, 48, 82, 83},
                {20, 22, 49, 85, 86},
                {21, 23, 50, 90, 92}
        };
        int key = 1;
        print(matrix);
        System.out.println("===================");

        KeyIndex keyIndex = searchForKey(matrix, key);
        System.out.println(keyIndex.toString());
    }

    public static KeyIndex searchForKey(int[][] matrix, int key) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == key)
                return new KeyIndex(i, j);
            else if (key < matrix[i][j])
                j--;
            else i++;
        }

        System.out.println("Key not found.");
        return new KeyIndex(-1, -1);
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

class KeyIndex {
    int x, y;

    public KeyIndex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Key found in (" + x + " , " + y + ").";
    }
}

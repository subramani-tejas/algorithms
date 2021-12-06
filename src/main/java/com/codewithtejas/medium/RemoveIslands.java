package com.codewithtejas.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveIslands {
    public static int[][] removeIslands(int[][] map) {
        boolean[][] onesConnectedToBorder = new boolean[map.length][map[0].length];
        for (int i = 0; i < map.length; i++)
            onesConnectedToBorder[i][map[0].length - 1] = false;

        for (var row = 0; row < map.length; row++) {
            for (var col = 0; col < map[row].length; col++) {
                boolean rowIsBorder = (row == 0 || row == map.length - 1);
                boolean colIsBorder = (col == 0 || col == map[row].length - 1);
                boolean isBorder = (rowIsBorder || colIsBorder);

                if (!isBorder) continue;
                if (map[row][col] != 1) continue;

                findOnesConnectedToBorder(map, row, col, onesConnectedToBorder);
            }
        }

        for (int row = 1; row < map.length - 1; row++) {
            for (int col = 1; col < map[row].length - 1; col++) {
                if (onesConnectedToBorder[row][col]) continue;
                map[row][col] = 0;
            }
        }
        return map;
    }

    public static void findOnesConnectedToBorder(int[][] map, int startRow, int startCol, boolean[][] onesConnectedToBorder) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startRow, startCol});

        while (stack.size() > 0) {
            int[] currentPosition = stack.pop();
            int currentRow = currentPosition[0];
            int currentCol = currentPosition[1];

            boolean alreadyVisited = onesConnectedToBorder[currentRow][currentCol];
            if (alreadyVisited) continue;
            onesConnectedToBorder[currentRow][currentCol] = true;

            int[][] neighbors = getNeighbors(map, currentRow, currentCol);
            for (var neighbor : neighbors) {
                int row = neighbor[0];
                int col = neighbor[1];

                if (map[row][col] != 1) continue;
                stack.push(neighbor);
            }
        }
    }

    public static int[][] getNeighbors(int[][] map, int row, int col) {
        int numRows = map.length;
        int numCols = map[row].length;
        List<int[]> temp = new ArrayList<>();

        // neighbors in all directions
        if (row - 1 >= 0) temp.add(new int[]{row - 1, col});
        if (row + 1 < numRows) temp.add(new int[]{row + 1, col});
        if (col - 1 >= 0) temp.add(new int[]{row, col - 1});
        if (col + 1 < numCols) temp.add(new int[]{row, col + 1});

        int[][] neighbors = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++)
            neighbors[i] = temp.get(i);

        return neighbors;
    }

    public static void main(String[] args) {
        int[][] map = {
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1}};
        var result = RemoveIslands.removeIslands(map);
        for (var item : result)
            System.out.println(Arrays.toString(item));
    }
}

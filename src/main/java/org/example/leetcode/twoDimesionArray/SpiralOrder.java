package org.example.leetcode.twoDimesionArray;

import java.util.List;
import java.util.ArrayList;

class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int colbegin = 0;
        int colend = matrix[0].length - 1;
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        while (rowbegin <= rowend && colbegin <= colend) {
            for (int i = colbegin; i <= colend; i++) {
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for (int i = rowbegin; i <= rowend; i++) {
                list.add(matrix[i][colend]);
            }
            colend--;
            if (rowbegin <= rowend) {
                for (int i = colend; i >= colbegin; i--) {
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if (colbegin <= colend) {
                for (int i = rowend; i >= rowbegin; i--) {
                    list.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        List<Integer> list = spiralOrder(a);
        System.out.print(list);
    }
}
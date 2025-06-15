package org.general;

class OddCellCountApproach2 {

    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2, 3, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int oddCol = 0;
        int oddRow = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        // calculate number of times increment have been made on row col;
        for (int[] index : indices) {
            row[index[0]] += 1;
            col[index[1]] += 1;
        }
        // find odd number of row (which have been increase odd number of times)
        for (int x : row) {
            if (x % 2 != 0) {
                oddRow++;
            }
        }
        // find odd number of col (which have been increase odd number of times)
        for (int x : col) {
            if (x % 2 != 0) {
                oddCol++;
            }
        }
        return oddRow * (n - oddCol) + oddCol * (m - oddRow);
    }
}
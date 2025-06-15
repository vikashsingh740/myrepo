package org.general;

class OddCellCountApproach1 {

    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2, 3, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            // fix the row and increase the count on column
            for (int j = 0; j < n; j++) {
                res[indices[i][0]][j] += 1;
            }
            // fix the col and increase the count on row
            for (int j = 0; j < m; j++) {
                res[j][indices[i][1]] += 1;
            }
        }
        int count=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
              if(res[i][j]!=0){
                  count++;
              }
            }
        }
        return count;
    }
}
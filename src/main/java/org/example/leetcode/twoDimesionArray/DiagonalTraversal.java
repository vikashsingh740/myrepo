package org.example.leetcode.twoDimesionArray;

class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] a = new int[m*n];
        int row=0;
        int col=0;
        boolean up = true;
        int i=0;
        while(row<m && col<n){
            if(up){
               while(row>0 && col<n-1){
                 a[i++] = mat[row][col];
                 row--;
                 col++;
               }
               a[i++] = mat[row][col];
               if(col==n-1){
                 row++;
               }else{
                col++;
               }
            }else{
              while(col>0 && row<m-1){
                 a[i++] = mat[row][col];
                 row++;
                 col--;
               }
               a[i++] = mat[row][col];
               if(row==m-1){
                 col++;
               }else{
                row++;
               }
            }
            up = !up;
        }
        return a;
    }

    public static void main(String[] args) {
        //[[1,2,3],[4,5,6],[7,8,9]];
    }
}
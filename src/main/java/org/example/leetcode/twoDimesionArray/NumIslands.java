package org.example.leetcode.twoDimesionArray;

class NumIslands {
    public void numIslands(char[][] grid, int i ,int j ,int rows,int cols){
       if(i>=rows || i<0 || j>=cols || j<0 || grid[i][j]=='2' || grid[i][j]=='0'){
         return;
       }
       grid[i][j]='2';
       numIslands(grid, i+1 ,j ,rows,cols);
       numIslands(grid, i-1 ,j ,rows,cols);
       numIslands(grid, i ,j+1 ,rows,cols);
       numIslands(grid, i ,j-1 ,rows,cols);
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int numberOfIsLand=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]== '1'){
                  numIslands(grid, i ,j ,rows,cols);
                  numberOfIsLand++;
                }
            }
        }
        return numberOfIsLand;
    }

    public static void main(String[] args) {
      // grid [["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
    }
}
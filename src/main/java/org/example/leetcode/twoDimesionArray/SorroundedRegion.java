package org.example.leetcode.twoDimesionArray;

class SorroundedRegion {

    public boolean isValid(char[][] board,int i, int j, int m, int n){
       if(i>=0 && i<m && j>=0 && j<n && board[i][j]=='O'){
          return true;
       }else{
          return false;
       }
    }

    public void dfs(char[][] board,int i,int j,int m,int n){
        board[i][j] = 'B';
       if(isValid(board,i-1,j,m,n)){
          dfs(board,i-1,j,m,n);           
       }
       if(isValid(board,i+1,j,m,n)){
          dfs(board,i+1,j,m,n);           
       }
       if(isValid(board,i,j-1,m,n)){
          dfs(board,i,j-1,m,n);           
       }
       if(isValid(board,i,j+1,m,n)){
          dfs(board,i,j+1,m,n);           
       }        
    }
    public void convert(char[][] board){
       for(int i=0;i<board.length;i++){
         for(int j=0;j<board[0].length;j++){
           if(board[i][j] == 'B'){
               board[i][j] = 'O';
           } else if(board[i][j] == 'O'){
               board[i][j] = 'X';
           }        
         } 
       }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        // top right to left
        int row=0;
        for(int col=0;col<n;col++){
            if(board[row][col] == 'O'){
                dfs(board,row,col,m,n);
            }
        }
        // bottom right to left
        row=m-1;
        for(int col=0;col<n;col++){
            if(board[row][col] == 'O'){
                dfs(board,row,col,m,n);
            }
        }
        // left top to bottom
        int col=0;
        for(row=0;row<m;row++){
            if(board[row][col] == 'O'){
                dfs(board,row,col,m,n);
            }
        }
        // right top to bottom
        col=n-1;
        for(row=0;row<m;row++){
            if(board[row][col] == 'O'){
                dfs(board,row,col,m,n);
            }
        }
        convert(board);
    }

    public static void main(String[] args) {
        //[["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
    }
}
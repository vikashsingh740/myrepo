package org.example.leetcode.twoDimesionArray;

public class AlternateRectagleWith0X {

    public void rectangleWithOX(char[][] board, int m, int n) {
        int rowBegin = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        boolean printx = true;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
           for(int i=colBegin;i<=colEnd;i++){
               if (printx){
                   board[rowBegin][i]='X';
               }else {
                   board[rowBegin][i]='0';
               }
           }
           rowBegin++;
           for (int i=rowBegin;i<=rowEnd;i++){
               if (printx){
                   board[i][colEnd]='X';
               }else {
                   board[i][colEnd]='0';
               }
           }
           colEnd--;
           if (rowBegin<=rowEnd){
               for (int i=colEnd;i>=colBegin;i--){
                   if (printx){
                       board[rowEnd][i]='X';
                   }else {
                       board[rowEnd][i]='0';
                   }
               }
           }
           rowEnd--;
           if(colBegin<=colEnd){
               for (int i=rowEnd;i>=rowBegin;i--){
                   if (printx){
                       board[i][colBegin]='X';
                   }else {
                       board[i][colBegin]='0';
                   }
               }
           }
           colBegin++;
           printx = !printx;
        }
    }

    public static void main(String[] args) {
        int m = 8;
        int n = 8;
      char[][] ch = new char[m][n];
      AlternateRectagleWith0X alternateRectagleWith0X = new AlternateRectagleWith0X();
      alternateRectagleWith0X.rectangleWithOX(ch,m,n);
      System.out.print(ch);
    }
}

package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {

    private boolean isSafe(char[][] board, int row, int column) {
        // horizontal
        int r = row;
        int c;
        for (c=0;c<board.length;c++){
            if (board[r][c]=='Q'){
                return false;
            }
        }

        // vertical
        c = column;
        for (r=0;r<board.length;r++){
            if (board[r][c]=='Q'){
                return false;
            }
        }

        // top right
        c = column;
        for (r=row;r<board.length && c<board.length;r++,c++){
            if ((board[r][c]=='Q')){
                return false;
            }
        }
        // top left
        c = column;
        for (r=row;r>=0 && c>=0;r--,c--){
            if ((board[r][c]=='Q')){
                return false;
            }
        }
        // bottom left
        c = column;
        for (r=row;r<board.length && c>=0;r++,c--){
            if ((board[r][c]=='Q')){
                return false;
            }
        }

        // bottom right
        c = column;
        for (r=row;r<board.length && c<board.length;r++,c++){
            if ((board[r][c]=='Q')){
                return false;
            }
        }
        return true;
    }

    private void saveBoards(List<List<String>> allBoards, char[][] board) {
        List<String> rows = new ArrayList<>();
        String row = "";
        for (int i=0;i<board.length;i++){
            row = "";
            for (int j=0;j<board.length;j++){
                if (board[i][j] == 'Q'){
                    row+=board[i][j];
                }else {
                    row+=".";
                }
            }
            rows.add(row);
        }
        allBoards.add(rows);
    }

    private void heper(List<List<String>> allBoards, char[][] board, int column) {
        if (column==board.length){
            saveBoards(allBoards,board);
            return;
        }
        for (int row = 0;row<board.length;row++){
            if (isSafe(board,row,column)){
                board[row][column] = 'Q';
                heper(allBoards,board,column+1);
                board[row][column] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        NQueenProblem nQueenProblem = new NQueenProblem();
        nQueenProblem.heper(allBoards,board,0);
        System.out.println("====>>> "+allBoards);
    }
}

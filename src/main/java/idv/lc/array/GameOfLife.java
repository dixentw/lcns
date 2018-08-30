package idv.lc.array;

import java.util.*;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        // first pass
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
               if (isLiveNext(board, i, j)) {
                   if (board[i][j] == 1) {
                       board[i][j] = 2;
                   } else {
                       board[i][j] = 4;
                   }
               } else {
                   if (board[i][j] == 1) {
                       board[i][j] = 3;
                   } else {
                       board[i][j] = 5;
                   }
               }
            }
        }
        // second pass
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
               if (board[i][j] == 2 || board[i][j] == 4) {
                   board[i][j] = 1;
               }
               if (board[i][j] == 3 || board[i][j] == 5) {
                   board[i][j] = 0;
               }
            }
        }
    }
    public boolean isLiveNext(int[][] board, int i, int j) {
        int lives = 0;
        for (int k=Math.max(i-1, 0); k<=Math.min(i+1, board.length-1); k++) {
            for (int l=Math.max(j-1, 0); l<=Math.min(j+1, board[i].length-1); l++) {
                if (board[k][l] == 1 || board[k][l] == 2 || board[k][l] == 3) {
                    lives++;
                }
            }
        }
        if (board[i][j] == 1 || board[i][j] == 2|| board[i][j] == 3) {
            lives--;
        }
        if (lives < 2 || lives > 3) {
            return false;
        }
        if (board[i][j] == 0 || board[i][j] == 4 || board[i][j] == 5) {
            if (lives == 3) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}

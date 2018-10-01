package idv.lc.array;

import java.util.*;

public class CandyCrush {
    public int[][] candyCrush(int[][] board) {
        int N = board.length;
        int M = board[0].length;
        boolean found = false;
        do {
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    int val = abs(board[i][j]);
                    if (val==0) continue;
                    if (j < M-2 && abs(board[i][j+1])==val && abs(board[i][j+1])==val) {
                        found = true;
                        int idx = j;
                        while (idx<M && abs(board[i][idx])==val) board[i][idx++] = -val;
                    }
                    if (i < N-2 && abs(board[i+1][j])==val && abs(board[i+2][j])==val) {
                        found = true;
                        int idx = i;
                        while (idx<N && abs(board[idx][j])==val) board[idx++][j] = -val;
                    }
                }
            }
            if (found) {
                for (int j=0; j<M; j++) {
                    int bottom = N-1;
                    for (int i=bottom; i>=0; i--) {
                        if (board[i][j] > 0) {
                            board[bottom--][j] = board[i][j];
                        }
                    }
                    for (int k = bottom; k >= 0; k--) board[k][j] = 0;
                }
            }
        } while (found);
        return board;
    }
    public int abs(int val) {
        return Math.abs(val);
    }
}

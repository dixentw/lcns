package idv.lc.array;

import java.util.*;

public class WordSearch {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        char[] wordChar = word.toCharArray();
        int len = wordChar.length;
        visited = new boolean[board.length][board[0].length];
        for (int i =0; i< board.length; i++) {
            for (int j=0; j< board[0].length; j++) {
                if (dfs(board, wordChar, i, j, 0, len)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, char[] word, int i, int j, int index, int len) {
        if (index == len) {
            return true;
        }
        if (i<0 || j<0 || i>=board.length || j>=board[0].length) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        if (board[i][j] != word[index]) return false;

        visited[i][j] = true;
        boolean down = dfs(board, word, i-1, j, index+1, len);
        boolean right = dfs(board, word, i, j-1, index+1, len);
        boolean up = dfs(board, word, i+1, j, index+1, len);
        boolean left = dfs(board, word, i, j+1, index+1, len);
        if(down || right || up || left) return true;
        visited[i][j] = false;
        return false;
    }
}

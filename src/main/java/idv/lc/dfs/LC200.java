package idv.lc.dfs;

import java.util.*;

public class LC200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == '1' && !isVisited[i][j]) {
                    res++;
                    dfs(grid, i, j, isVisited);
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid, int x, int y, boolean[][] isVisited) {
        if (x < 0 || x >= grid.length || y < 0 || y>=grid[0].length) {
            return;
        }
        if (grid[x][y] == '0' || isVisited[x][y]) {
            return;
        }
        isVisited[x][y] = true;
        grid[x][y] = '0';
        dfs(grid, x-1, y, isVisited);
        dfs(grid, x, y-1, isVisited);
        dfs(grid, x+1, y, isVisited);
        dfs(grid, x, y+1, isVisited);
    }
}

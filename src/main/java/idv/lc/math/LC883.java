package idv.lc.math;

import java.util.*;

public class LC883 {
    public int projectionArea(int[][] grid) {
        int top = 0;
        int[] sideX = new int[grid.length];
        int[] sideY = new int[grid[0].length];
        for (int x=0; x<grid.length; x++) {
            for (int y=0; y<grid[0].length; y++) {
                if (grid[x][y] != 0) top++;
                if (grid[x][y] > sideX[x]) {
                    sideX[x] = grid[x][y];
                }
                if (grid[x][y] > sideY[y]) {
                    sideY[y] = grid[x][y];
                }
            }
        }
        int sumx = 0;
        for (int x : sideX) sumx += x;
        int sumy = 0;
        for (int y : sideY) sumy += y;
        return top + sumx + sumy;
    }
}

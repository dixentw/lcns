package idv.lc.array;

import java.util.*;

public class MagicSquares {
    public int numMagicSquaresInside(int[][] grid) {
        int counter = 0;
        for (int i=0; i<grid.length-2; i++) {
            for (int j=0; j<grid[0].length-2; j++) {
                if (isMagic(grid, i, j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean isMagic(int[][] grid, int x, int y) {
        int[] rows = new int[3];
        int[] cols = new int[3];
        int d1 = 0;
        int d2 = 0;
        for (int i=x; i<x+3; i++) {
            for (int j=y; j<y+3; j++) {
                if (grid[i][j] > 9 || grid[i][j] <1) {
                    return false;
                }
                if ((i-x)==(j-y)){
                    d1 += grid[i][j];
                }
                if ((i-x)==2-(j-y)) {
                    d2 += grid[i][j];
                }
                rows[i-x] += grid[i][j];
                cols[j-y] += grid[i][j];
            }
        }
        if (d1 == d2 && d2 == rows[0] && rows[0]==rows[1] && rows[1]==rows[2]
               && rows[2]==cols[0] && cols[0]==cols[1]&&cols[1]==cols[2]){
            return true;
        } else {
            return false;
        }
    }
}

package idv.lc.array;

import java.util.*;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] grid = new int[n][n];
        int is = 0;
        int ie = n-1;
        int js = 0;
        int je = n-1;
        int num = 1;
        while (is <= ie && js <= je) {
            for (int k=js; k<=je; k++) {
                grid[is][k] = num++;
            }
            is++;
            for (int k=is; k<=ie; k++) {
                grid[k][je] = num++;
            }
            je--;
            for (int k=je; k>=js; k--) {
                grid[ie][k] = num++;
            }
            ie--;
            for (int k=ie; k>=is; k--) {
                grid[k][js] = num++;
            }
            js++;
        }
        return grid;
    }
}

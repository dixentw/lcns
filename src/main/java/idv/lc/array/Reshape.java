package idv.lc.array;

import java.util.*;

public class Reshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m*n != r*c) {
            return nums;
        }
        int[][] out = new int[r][c];
        for (int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                int order = i*c + j;
                int oi = order / n;
                int oj = order % n;
                out[i][j] = nums[oi][oj];
            }
        }
        return out;
    }
}

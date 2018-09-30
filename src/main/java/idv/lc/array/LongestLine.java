package idv.lc.array;

import java.util.*;

public class LongestLine {
    public int longestLine(int[][] M) {
        int res = 0;
        for (int i=0; i<M.length; i++) {
            for (int j=0; j<M[0].length; j++) {
                if (M[i][j]==1) {
                    res = Math.max(res, helper(M, i, j, 0));
                    res = Math.max(res, helper(M, i, j, 1));
                    res = Math.max(res, helper(M, i, j, 2));
                    res = Math.max(res, helper(M, i, j, 3));
                }
            }
        }
        return res;
    }
    public int helper(int[][] M, int x, int y, int mode) {
        if (x>=M.length || x<0 || y>=M[0].length || M[x][y] == 0) return 0;
        if (mode==0) {
            return helper(M, x+1, y, mode) + 1;
        } else if (mode==1) {
            return helper(M, x, y+1, mode) + 1;
        } else if (mode==2) {
            return helper(M, x+1, y+1, mode) +1;
        } else {
            return helper(M, x+1, y-1, mode) +1;
        }
    }
}

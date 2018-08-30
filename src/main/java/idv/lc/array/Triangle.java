package idv.lc.array;

import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int[] dp = new int[triangle.size()+1]; // this value is actually the bottom element count
        for (int i=triangle.size()-1; i>=0; i--) {
            for (int j=0; j<triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
    // too slow
    public int minimumTotal1(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<triangle.get(triangle.size()-1).size(); i++) {
            int res = getMinPath(triangle, triangle.size()-1, i);
            min = Math.min(min, res);
        }
        return min;
    }
    public int getMinPath (List<List<Integer>> tri, int i, int j) {
        if (i == 0) {
            return tri.get(0).get(0);
        }
        if (j == 0) {
            return tri.get(i).get(j) + getMinPath(tri, i-1, j);
        } else if (j == tri.get(i).size() - 1) {
            return tri.get(i).get(j) + getMinPath(tri, i-1, j-1);
        } else {
            return tri.get(i).get(j) + Math.min(getMinPath(tri, i-1, j), getMinPath(tri, i-1, j-1));
        }
    }
}

package idv.lc.math;

import java.util.*;

public class LC279 {
    public int numSquares(int n) {
        int[] DP = new int[n+1];
        DP[0] = 0;
        for (int i=1; i<=n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=1; i-j*j>=0; j++) {
                min = Math.min(min, DP[i-j*j]+1);
            }
            DP[i]  = min;
        }
        return DP[n];
    }
}

package idv.lc.tree;

import java.util.*;

public class LC96 {
    public int numTrees(int n) {
        int[] DP = new int[n+1];
        DP[0] = 1;
        DP[1] = 1;
        for (int i=2; i<=n; i++) { // how many nodes using
            for (int root=1; root<=i; root++) {
                DP[i] += DP[i-root]/*right*/ * DP[root-1]/*left*/;
            }
        }
        return DP[n];
    }
    public int numTreesREC(int n) {
        if (n==0) return 0;
        return helper(1, n);
    }
    public int helper(int start, int end) {
        if (start > end) return 1;
        int sum = 0;
        for (int i=start; i<=end; i++) {
            int left = helper(start, i-1);
            int right = helper(i+1, end);
            sum += left*right;
        }
        return sum;
    }
}

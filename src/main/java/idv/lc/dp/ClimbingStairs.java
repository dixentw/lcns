package idv.lc.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        int[] ways = new int[n];
        ways[0] = 1; // climb to first step take one way
        ways[1] = 2; // climb to second step take two ways
        for (int i=2; i<n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n-1];

    }
}

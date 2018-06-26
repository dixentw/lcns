package idv.lc.array;

import java.util.*;

class MaxRepeatArr {

    public int findLength(int[] A, int[] B) {
        int[][] DP = new int[A.length+1][B.length+1];
        int max = Integer.MIN_VALUE;
        DP[0][0] = 0;
        for(int i=1; i<=A.length; i++) {
            for(int j=1; j<=B.length; j++) {
                if(A[i-1]==B[j-1]) {
                    DP[i][j] = DP[i-1][j-1] + 1;
                }else{
                    DP[i][j] = 0;
                }
                max = Math.max(DP[i][j], max);
            }
        }
        return (max == Integer.MIN_VALUE) ? 0: max;
    }

    public int findLength1(int[] A, int[] B) {
        int maxSubLen = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                if(A[i] == B[j]) {
                   int tmpLen = 0;
                   int x=i, y=j;
                    while(x < A.length && y < B.length && A[x++] == B[y++]) {
                        tmpLen++;
                    }
                    maxSubLen = Math.max(tmpLen, maxSubLen);
                }
            }
        }
        return (maxSubLen == Integer.MIN_VALUE) ? 0: maxSubLen;
    }
}

package idv.lc.array;

import java.util.*;

public class LargestOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int n = A.length;
        int[][] EA = new int[3*n][3*n];
        for (int i=n; i<2*n; i++) {
            for (int j=n; j<2*n; j++) {
                EA[i][j] = A[i-n][j-n];
            }
        }
        int res = 0;
        for (int i=0; i<2*n; i++) {
            for (int j=0; j<2*n; j++) {
                int localRes = 0;
                for (int k=0; k<B.length; k++) {
                    for (int l=0; l<B[0].length; l++) {
                        if (EA[i+k][j+l]==1&&B[k][l]==1) {
                            localRes++;
                        }
                    }
                }
                res = Math.max(res, localRes);
            }
        }
        return res;
    }
}

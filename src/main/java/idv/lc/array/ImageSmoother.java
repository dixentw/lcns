package idv.lc.array;

import java.util.*;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] output = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                output[i][j] = newVal(M, m, n, i, j);
            }
        }
        return output;
    }
    public int newVal(int[][] M, int m, int n, int i, int j) {
        int total = 0;
        int sum = 0;
        for (int k = Math.max(0, i-1); k<=Math.min(m-1, i+1); k++) {
            for (int l = Math.max(0, j-1); l<=Math.min(n-1, j+1); l++) {
                sum += M[k][l];
                total++;
            }
        }
        return sum/total;
    }
}

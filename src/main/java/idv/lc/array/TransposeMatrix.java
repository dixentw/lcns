package idv.lc.array;

import java.util.*;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] out = new int[A[0].length][A.length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                out[j][i] = A[i][j];
            }
        }
        return out;
    }
}

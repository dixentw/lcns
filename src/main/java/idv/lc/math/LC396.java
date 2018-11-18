package idv.lc.math;

import java.util.*;

public class LC396 {
    public int maxRotateFunction(int[] A) {
        int f = 0;
        int sum = 0;
        for (int i=0; i<A.length; i++) {
            f += i * A[i];
            sum += A[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i=1; i<A.length; i++) {
            f = f + sum - A.length*A[A.length-i];
            max = Math.max(max, f);
        }
        return max;
    }
}

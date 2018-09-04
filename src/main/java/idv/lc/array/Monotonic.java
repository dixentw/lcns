package idv.lc.array;

import java.util.*;

public class Monotonic {
    public boolean isMonotonic(int[] A) {
        boolean ma = true;
        boolean md = true;
        for (int i=1 ;i <A.length; i++) {
            if (A[i] < A[i-1]) {
                ma = false;
            }
            if (A[i] > A[i-1]) {
                md = false;
            }
        }
        return ma || md;
    }
}

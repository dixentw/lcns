package idv.lc.math;

import java.util.*;

public class LC413 {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        int res = 0;
        int len = 2;
        for (int i=2; i<A.length; i++) {
            if (A[i-1] - A[i-2] == A[i] - A[i-1]) {
                len++;
            } else {
                if (len > 2) {
                    res += (len-1)*(len-2)/2;
                }
                len = 2;
            }
        }
        if (len > 2) res += (len-1)*(len-2)/2;
        return res;
    }

    /*
    public int numberOfArithmeticSlicesIncomplete(int[] A) {
        if (A.length < 3 ) return 0;
        Map<Integer, Integer> m = new HashMap<>();
        int start = 0;
        int end = 1;
        int diff = A[start] - A[end];
        while (end < A.length) {
           if( diff == (A[end] - A[start])) {
               m.put(start, end);
               end++;
           } else {
               diff = A[end] - A[start];

           }
        }
    }*/
}

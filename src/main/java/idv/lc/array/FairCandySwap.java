package idv.lc.array;

import java.util.*;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        for(int i=0; i<A.length; i++) {
            sumA += A[i];
        }
        int sumB = 0;
        for(int i=0; i<B.length; i++) {
            sumB += B[i];
        }
        int expect = (sumA + sumB) / 2;
        Set<Integer> sa = new HashSet<>();
        for (Integer i: A) sa.add(i);
        for (int i=0; i< B.length; i++) {
            int targetA = expect - (sumB - B[i]);
            if (sa.contains(targetA)) {
                return new int[]{targetA, B[i]};
            }
        }
        return null;
    }
}

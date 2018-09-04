package idv.lc.array;

import java.util.*;

public class LongestFibSubseq {
    public int lenLongestFibSubseq(int[] A) {
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer i : A) set.add(i);
        for (int i=0; i<A.length; i++) {
            for (int j=i+1; j<A.length; j++) {
                int a = A[i];
                int b = A[j];
                int localLen = 2;
                while(set.contains(a+b)){
                    b = a + b;
                    a = b - a;
                    localLen++;
                }
                int l = (localLen==2)? 0:localLen;
                maxLen = Math.max(maxLen, l);
            }
        }
        return maxLen;
    }
}

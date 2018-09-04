package idv.lc.array;

import java.util.*;

public class AdvantageCount {
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i=0; i<A.length; i++) {
            if (tm.containsKey(A[i])) {
                tm.put(A[i], tm.get(A[i])+1);
            } else {
                tm.put(A[i], 1);
            }
        }
        int[] out = new int[A.length];
        for (int i=0; i<A.length; i++) {
            Integer key = tm.higherKey(B[i]);
            if (key == null) {
                out[i] = tm.firstKey();
            } else {
                out[i] = key;
            }
            if (tm.get(out[i]) == 1) {
                tm.remove(out[i]);
            } else {
                tm.put(out[i],tm.get(out[i])-1);
            }
        }
        return out;
    }
}

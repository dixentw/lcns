package idv.lc.array;

import java.util.*;

public class GetModifiedArray {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int[] up : updates) {
            res[up[0]] += up[2];
            if (up[1] + 1 < length) res[up[1] + 1] -= up[2];
        }
        int sum = 0;
        for (int i=0; i<length; i++) {
            sum += res[i];
            res[i] = sum;
        }
        return res;
    }

    public int[] getModifiedArraySelf(int length, int[][] updates) {
        int[] res = new int[length];
        for (int i=0; i<length; i++) {
            for (int[] up : updates) {
                if (i>=up[0]&&i<=up[1]) res[i] += up[2];
            }
        }
        return res;
    }
}

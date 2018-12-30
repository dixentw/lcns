package idv.lc.bit;

import java.util.*;

public class LC461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        for (int i=0;i<32;i++) count += (xor >> i) & 1;
        return count;
    }
    public int _hammingDistance(int x, int y) {
        int res = 0;
        while (x!=0 || y!=0) {
            int a = x & 1;
            int b = y & 1;
            if (a != b) res++;
            x = x >>> 1;
            y = y >>> 1;
        }
        return res;
    }
}

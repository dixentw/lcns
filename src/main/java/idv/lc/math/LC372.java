package idv.lc.math;

import java.util.*;

public class LC372 {
    public int superPow(int a, int[] b) {
        if (b.length==0) return 1;
        int lastDigit = b[b.length-1];
        int[] nb = Arrays.copyOfRange(b, 0, b.length-1);
        return powMod(superPow(a, nb), 10, 1337) * powMod(a, lastDigit, 1337) % 1337;

    }
    public int powMod(int a, int k, int base) {
        if (k == 0) return 1;
        int rem = a % base;
        int result = 1;
        for (int i=0; i<k; i++) {
            result = (result * rem) % base;
        }
        return result;
    }
}

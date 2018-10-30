package idv.lc.math;

import java.util.*;

public class LC7 {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }
        long res = 0L;
        while (x > 0) {
            int part = x % 10;
            res = (res * 10) + part;
            x = x/10;
        }
        res = sign * res;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) res;
        }
    }
}

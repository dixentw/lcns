package idv.lc.math;

import java.util.*;

public class LC264 {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n+1];
        int index2 = 1;
        int index3 = 1;
        int index5 = 1;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        ugly[1] = 1;
        for (int i=2; i<=n; i++) {
            ugly[i] = Math.min(factor2, Math.min(factor3, factor5));
            if (ugly[i] == factor2) {
                factor2 = 2 * ugly[++index2];
            }
            if (ugly[i] == factor3) {
                factor3 = 3 * ugly[++index3];
            }
            if (ugly[i] == factor5) {
                factor5 = 5 * ugly[++index5];
            }

        }
        return ugly[n];
    }
}

package idv.lc.math;

import java.util.*;

public class LC343 {
    public int integerBreak(int n) {
        int product = 1;
        if (n==2) return 1;
        if (n==3) return 2;
        while (n > 4) {
            product *= 3;
            n = n-3;
        }
        product *= n;
        return product;
    }
}

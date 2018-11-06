package idv.lc.math;

import java.util.*;

public class LC231 {
    public boolean isPowerOfTwo(int n) {
        int cnt = 0;
        while (n > 0 ) {
            if (n % 2 == 1) cnt++;
            n = n >>> 1;
        }
        return cnt == 1;
    }
}

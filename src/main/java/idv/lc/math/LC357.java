package idv.lc.math;

import java.util.*;

public class LC357 {
    public int countNumbersWithUniqueDigits(int n) {
        int cnt = 1;
        if (n == 0) return cnt;
        for (int i=1; i<=n; i++) {
            int tmp = 9;
            for (int j=9 ; j>10-i; j--) {
                tmp *= j;
            }
            cnt += tmp;
        }
        return cnt;
    }
}

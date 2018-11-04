package idv.lc.math;

import java.util.*;

public class LC172 {
    public int trailingZeroesRev(int n) {
        if (n == 0) return 0;
        return n / 5 + trailingZeroes(n/5);
    }

    public int trailingZeroes(int n) {
        int cnt = 0;
        while(n > 0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
    public int trailingZeroesTLE(int n) {
        int count = 0;
        for (int i=1; i<=n; i++) {
            int num = i;
            while (num % 5 == 0) {
                count++;
                num /= 5;
            }
        }
        return count;
    }
}

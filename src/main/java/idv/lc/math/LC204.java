package idv.lc.math;

import java.util.*;

public class LC204 {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] noPrimes = new boolean[n];
        for (int i=2; i<n; i++) {
            if (!noPrimes[i]) {
                res++;
                for (int j=2; i*j<n; j++) {
                    noPrimes[i*j] = true;
                }
            }
        }
        return res;
    }
}

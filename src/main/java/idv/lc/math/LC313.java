package idv.lc.math;

import java.util.*;

public class LC313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n+1];
        int[] indexes = new int[primes.length];
        Arrays.fill(indexes, 1);
        int[] factors = Arrays.copyOf(primes, primes.length);
        ugly[1] = 1;
        for (int i=2; i<=n; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j=0; j<primes.length; j++) {
                if (factors[j] < min) {
                    min = factors[j];
                    idx = j;
                }
            }
            ugly[i] = min;
            factors[idx] = primes[idx] * ugly[++indexes[idx]];
            for (int j = 0; j < primes.length; j++) {
                while (factors[j] <= ugly[i]) {
                    factors[j] = primes[j] * ugly[++indexes[j]];
                }
            }
        }
        return ugly[n];
    }
}

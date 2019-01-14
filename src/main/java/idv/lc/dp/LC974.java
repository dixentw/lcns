package idv.lc.dp;

import java.util.*;

public class LC974 {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int cnt = 0;
        for (int i=0; i<A.length; i++) {
            sum += A[i];
            sum %= K;
            if (sum < 0) sum += K;
            cnt += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}

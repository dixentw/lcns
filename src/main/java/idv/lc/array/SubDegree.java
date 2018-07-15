package idv.lc.array;

import java.util.*;

public class SubDegree {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer[]> table = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            Integer[] cnt = table.get(nums[i]);
            if (cnt == null) {
                table.put(nums[i], new Integer[]{1, i, i});
            } else {
                cnt[0]++;
                cnt[2] = i ;
                table.put(nums[i], cnt);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer[]> e : table.entrySet()) {
            Integer[] cnt = e.getValue();
            if(cnt[0] >= max) {
                max = cnt[0];
            }
        }
        int minLen = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer[]> e : table.entrySet()) {
            Integer[] cnt = e.getValue();
            if(cnt[0] == max) {
                minLen = Math.min(minLen, cnt[2] - cnt[1] + 1);
            }
        }
        return minLen;
    }
}

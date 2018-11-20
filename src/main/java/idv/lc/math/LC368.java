package idv.lc.math;

import java.util.*;

public class LC368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length==0) return res;
        Arrays.sort(nums);
        int[] DP = new int[nums.length];
        Arrays.fill(DP, 1);
        for (int i=1; i<nums.length; i++) {
            for (int j=i-1; j>=0; j--) {
                if (nums[i] % nums[j] == 0) {
                    DP[i] = Math.max(DP[j]+1, DP[i]);
                }
            }
        }
        int maxIdx = 0;
        for (int i=0; i<nums.length; i++) {
            if (DP[i] > DP[maxIdx]) {
                maxIdx = i;
            }
        }
        int topVal = nums[maxIdx];
        int maxLen = DP[maxIdx];
        for (int i= maxIdx; i>=0; i--) {
            if (topVal % nums[i] == 0 && maxLen == DP[i] ) {
                res.add(nums[i]);
                topVal = nums[i];
                maxLen--;
            }
        }
        return res;
    }
}

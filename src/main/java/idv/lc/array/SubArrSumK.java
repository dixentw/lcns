package idv.lc.array;

import java.util.*;

public class SubArrSumK {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                result += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); //save all the sum
        }
        return result;
    }

    public int subarraySum1(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int result = 0;
        int tmp = nums[0];
        while (end < nums.length && start < nums.length) {
            if (tmp == k) {
                result++;
                end++; //or start++, or both
            } else if (tmp < k) {
                end++;
                if (end == nums.length) {
                    break;
                }
                tmp += nums[end];
            } else {
                start++;
                if (start == nums.length) {
                    break;
                }
                tmp -= nums[start];
            }
        }
        return result;
    }
}

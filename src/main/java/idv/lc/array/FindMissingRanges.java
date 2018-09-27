package idv.lc.array;

import java.util.*;

public class FindMissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) {
            res.add(toRange(lower, upper));
            return res;
        }
        if(lower == Integer.MAX_VALUE) {
            return res;
        }
        int next = lower;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < next) continue;
            if (nums[i] == next) {
                next++;
                continue;
            }
            res.add(toRange(next, nums[i] - 1));
            if (nums[i] == upper) return res;
            next = nums[i] + 1;
        }
        if (next <= upper) res.add(toRange(next, upper));
        return res;
    }

    public List<String> findMissingRangesFAIL(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;
        if (nums[0] - lower > 1) res.add(toRange(lower, nums[0]-1));
        for (int i=1; i<nums.length; i++) {
            if (nums[i] - nums[i-1] > 1) {
                res.add(toRange(nums[i-1]+1, nums[i]-1));
            }
        }
        if (upper - nums[nums.length-1] > 1) res.add(toRange(nums[nums.length-1]+1, upper));
        return res;
    }
    public String toRange (int l, int r) {
        if (l==r) {
            return String.valueOf(l);
        }
        return String.valueOf(l) + "->" + String.valueOf(r);
    }
}

package idv.lc.array;

import java.util.*;

public class SumRange {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<String>();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        res.add(first);
        int resCnt = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] - nums[i-1] == 1) {
                res.get(resCnt).add(nums[i]);
            } else {
                List<Integer> second = new ArrayList<>();
                second.add(nums[i]);
                res.add(second);
                resCnt++;
            }
        }
        List<String> output = new ArrayList<String>();
        for (List<Integer> r : res) {
            if (r.size() == 1) {
                output.add(String.valueOf(r.get(0)));
            } else {
                output.add(String.valueOf(r.get(0))+ "->" + String.valueOf(r.get(r.size()-1)));
            }
        }
        return output;
    }
}

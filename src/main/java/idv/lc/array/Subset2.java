package idv.lc.array;

import java.util.*;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> path, int start) {
        res.add(new ArrayList<Integer>(path));
        for (int i=start; i<nums.length; i++) {
            if(i!=0 && i>start && nums[i]==nums[i-1]) {
                continue;
            }
            path.add(nums[i]);
            helper(nums, res, path, i+1);
            path.remove(path.size()-1);
        }
    }
}

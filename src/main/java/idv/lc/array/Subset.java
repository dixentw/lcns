package idv.lc.array;

import java.util.*;

class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<Integer>(), 0);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> path, int start) {
        res.add(new ArrayList<Integer>(path));
        for(int i=start; i<nums.length; i++){
            path.add(nums[i]);
            helper(res, nums, path, i+1);
            path.remove(path.size() - 1);
        }
    }
}

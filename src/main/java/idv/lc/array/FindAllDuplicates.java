package idv.lc.array;

import java.util.*;

class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            nums[Math.abs(val)-1] = -nums[Math.abs(val)-1];
            if (nums[Math.abs(val)-1] > 0) {
                res.add(Math.abs(val));
            }
        }
        return res;
    }
}

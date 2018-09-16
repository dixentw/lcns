package idv.lc.array;

import java.util.*;

class FindDisapearedNum {
    /*
     * 掃一遍，使用value as index把原本的數組變成負數
     * >>> (第二次想沒想通) 如果已經是負數就不再標註負數
     * 最後是不是負數的那幾個就是
     *
     * [FAIL] - nums[val]要減一 -> nums[val-1]
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]);
            if(nums[val-1] > 0){
                nums[val-1] = -nums[val-1];
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
}

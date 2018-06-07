package idv.lc.array;

import java.util.*;

class NonDecreaseArr {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int smallIdx = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                count++;
                if(i-2 <0 || nums[i-2] <= nums[i]){ // find a possible way to modify, if this array survived, then count is less or equal than 1
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }
}

package idv.lc.array;

import java.util.*;

class LargestTwice {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max) {
                max2 = max;
                max = nums[i];
                maxIdx = i;
            }else if(nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if(max >= max2*2){
            return maxIdx;
        }else{
            return -1;
        }
    }
}

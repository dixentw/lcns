package idv.lc.array;

import java.util.*;

class LCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxLen = 1; // don't need to set integer min, cause mininal is 1
        int tmpLen = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                tmpLen++;
            }else{
                tmpLen = 1;
            }
            maxLen = Math.max(maxLen, tmpLen); //compare max everytime, so that we don't need separated line again outside of loop
        }
        return maxLen;
    }
}

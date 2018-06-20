package idv.lc.array;

import java.util.*;

class LCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxLen = Integer.MIN_VALUE;
        int tmpLen = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                tmpLen++;
            }else{
                maxLen = Math.max(maxLen, tmpLen);
                tmpLen = 1;
            }
        }
        maxLen = Math.max(maxLen, tmpLen);
        return maxLen;
    }
}

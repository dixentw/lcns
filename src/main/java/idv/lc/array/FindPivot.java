package idv.lc.array;

import java.util.*;

class FindPivot {
    public int pivotIndex(int[] nums) {
        int right = 0;
        int left = 0;
        for(int i=0; i<nums.length; i++) {
            right += nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            if(i-1>=0) left += nums[i-1];
            right -= nums[i];
            if(left == right) {
                return i;
            }
        }
        return -1;
    }
}

package idv.lc.array;

import java.util.*;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}

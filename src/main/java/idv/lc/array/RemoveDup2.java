package idv.lc.array;

import java.util.*;

class RemoveDup2 {
    public int removeDuplicates(int[] nums) {
        int start = 2;
        for(int i=2; i<nums.length;i++){
            if (nums[i] != nums[start-2]) {
                nums[start++] = nums[i];
            }
        }
        return start;
    }

    public int removeDuplicatesOLD(int[] nums) {
        int start = 0;
        int cnt = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]) {
                start++;
                cnt = 0;
            } else {
                cnt++;
                if(cnt<2){
                    start++;
                }
            }
            nums[start] = nums[i];
        }
        return start+1;
    }
}

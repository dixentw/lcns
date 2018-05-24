package idv.lc.array;

import java.util.*;

class JumpGame {
    public boolean canJump(int[] nums) {
        // the array should be remaining step we have
        int[] DP = new int[nums.length];
        DP[0] = 0;
        for(int i=1; i< nums.length; i++){
            DP[i] = Math.max(DP[i-1], nums[i-1]) - 1;
            if(DP[i] < 0){
                return false;
            }
        }
        return true;
    }
}

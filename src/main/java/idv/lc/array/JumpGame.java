package idv.lc.array;

import java.util.*;

class JumpGame {
    /*
     * DP[i] = 剩下來可以跳的步數
     * DP[i] 有兩種選擇，一種是用前面的，意即，使用前面幾步存下來的步數
     * 或者是採用前面一個array的步數，取最大減一
     */
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

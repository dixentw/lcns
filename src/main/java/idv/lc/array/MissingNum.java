package idv.lc.array;

import java.util.*;

public class MissingNum {
    public int missingNumber(int[] nums) {
        long sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += (long)nums[i];
        }
        long exp = (1+nums.length)*nums.length/2;
        return (int)exp - (int)sum;
    }
}

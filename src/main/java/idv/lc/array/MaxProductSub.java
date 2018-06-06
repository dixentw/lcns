package idv.lc.array;

import java.util.*;

class MaxProductSub {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] DPBig = new int[nums.length];
        int[] DPSmall = new int[nums.length];
        DPBig[0] = nums[0];
        DPSmall[0] = nums[0];
        int maxAll = nums[0];
        for(int i=1;i < nums.length; i++){
            int product1 = DPBig[i-1] * nums[i];
            int product2 = DPSmall[i-1] * nums[i];
            DPBig[i] = Math.max(product1, Math.max(product2, nums[i]));
            DPSmall[i]= Math.min(product1, Math.min(product2, nums[i]));
            maxAll = Math.max(DPBig[i], maxAll);
        }
        return maxAll;
    }
}

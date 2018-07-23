package idv.lc.array;

import java.util.*;

public class ValidTriangle {
    public int triangleNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i=2; i<nums.length; i++) {
            int start = 0;
            int end = i-1;
            while(start < end){
                if (nums[start] + nums[end] > nums[i]) {
                    result += end - start;
                    end --;
                } else {
                    start++;
                }
            }
        }
        return result;
    }

    public int triangleNumberNaive(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int max = Math.max(nums[i], Math.max(nums[j], nums[k]));
                    if (sum % 2 != 0) {
                        sum++;
                    }
                    if (max < sum/2) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

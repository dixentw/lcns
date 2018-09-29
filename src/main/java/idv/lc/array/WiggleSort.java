package idv.lc.array;

import java.util.*;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            if (i%2==1) {
                if(nums[i-1]>nums[i]) {
                    int tmp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = tmp;
                }
            } else {
                if(nums[i-1] < nums[i]) {
                    int tmp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
    }
    public void wiggleSortFAIL(int[] nums) {
        for (int i=0; i<nums.length-1; i+=2) {
            int max = 0;
            int maxIdx = 0;
            if (i == nums.length-2) {
                if (nums[i] > nums[i+1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                }
                i++;
                continue;
            }
            int j = i;
            for (; j<i+3; j++) {
                if (nums[j] > max) {
                    maxIdx = j;
                    max = nums[j];
                }
            }
            if (j!=i+1) {
                int tmp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}

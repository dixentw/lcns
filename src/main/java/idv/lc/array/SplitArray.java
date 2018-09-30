package idv.lc.array;

import java.util.*;

public class SplitArray {
    public boolean splitArray(int[] nums) {
        int sum = 0;
        List<Integer> sumTable = new ArrayList<>();
        for (int i : nums) {
            sum += i;
            sumTable.add(sum);
        }
        for (int i=1; i<nums.length-5; i++) {
            for (int j=nums.length-2; j>i; j--) {
                int leftPart = sumTable.get(i) - nums[i];
                int rightPart = sum - sumTable.get(j);
                if (leftPart == rightPart) {
                    int middleVal = sum - 4*leftPart - nums[i] - nums[j];
                    for (int k=i+1; k<j; k++) {
                        if (nums[k] == middleVal) return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean splitArrayFAIL(int[] nums) {
        int sum = 0;
        List<Integer> sumTable = new ArrayList<>();
        for (int i : nums) {
            sum += i;
            sumTable.add(sum);
        }
        int start = 1;
        int end = nums.length-2;
        // cannot use while start and end, because we cannot guarentee the next possible solution exist in both start++ and end --
        while (end-start >= 3) {
            int leftPart = sumTable.get(start) - nums[start];
            int rightPart = sum - sumTable.get(end);
            if (leftPart == rightPart) {
                int middleVal = sum - 4*leftPart - nums[start] - nums[end];
                for (int i=start+1; i<end; i++) {
                    if (nums[i] == middleVal) return true;
                }
            }
            start++;
            end--;
        }
        return false;
    }
}

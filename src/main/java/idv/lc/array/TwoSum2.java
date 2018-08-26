package idv.lc.array;

import java.util.*;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start+1, end+1};
            } else if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            }
        }
        // never reach
        return new int[]{0, 0};
    }
}

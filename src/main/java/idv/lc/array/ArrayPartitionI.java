package idv.lc.array;

import java.util.*;

public class ArrayPartitionI {
    // O(nlogn)
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    // O(n)
    public int arrayPairSumV2(int[] nums) {
        int[] map = new int[20001];
        // map int array to map, indexed by value
        for (int i=0; i<nums.length; i++) {
            map[nums[i]+10000]++;
        }
        // loop through value, equals to sort
        boolean odd = true;
        int sum = 0;
        for (int i=0; i<map.length; i++) {
            // if there is duplication, need to take care of this
            while(map[i] > 0) {
                if(odd) {
                    sum += (i - 10000);
                }
                odd = !odd;
                map[i]--;
            }
        }
        return sum;
    }
}

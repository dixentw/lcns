package idv.lc.array;

import java.util.*;

class KDiffPair {
    /*
     * sort the array, find the k diff and return result
     * 但是，不能只看往前一個，有可能要看到好幾個，基本邏輯必須應用Two-Sum
     * Naive是O(n^2)解
     * 我們有HashMap跟Two pointer解法
     */

    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int cnt = 0;
        for (int i=0, j=1; i<n&&j<n;) {
            // 處理dup時會造成i ==j, 這時候需要強迫+1, like [1,1,3,4,5], k=0
            if (nums[j] - nums[i] == k) {
                cnt++;
                while(j<n-1&&nums[j+1]==nums[j]) j++;
                j++;
                //可以不用在這邊處理i++, 下次等他追上來就好
                //while(i<n-1&&nums[i+1]==nums[i]) i++;
                //i++;
            } else if (nums[j] - nums[i] < k) {
                while(j<n-1&&nums[j+1]==nums[j]) j++;
                j++;
            } else {
                while(i<n-1&&nums[i+1]==nums[i]) i++;
                i++;
                //在這邊的時候確保j>i
                j = i+1;
            }
        }
        return cnt;
    }
    public int findPairsOld(int[] nums, int k) {
        Arrays.sort(nums);
        int p = 0;
        for(int i = 0; i<nums.length-1; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]-nums[i]==k){
                    p++;
                    break;
                }
            }
        }
        return p;
    }
}

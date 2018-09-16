package idv.lc.array;

import java.util.*;

class ContainDups2 {
    //
    // 找到兩個元素，在k個範圍內是一樣的
    //
    // naive, too slow => 對每個i, 尋找 [i-k,i+k]的每個pair都做一遍，要注意i!=j
    //
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i-k; j<=i+k; j++){
                if(j>=0 && j<nums.length && i!=j && nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // better, 然後不用那麼煩麻，只要num.....num 的距離超過k, 就update 第二個num的index,
    // 因為第三個num跟第一個一定大於 k, 所以判斷第三num跟第二num的距離就好了
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int diff = Math.abs(map.get(nums[i]) - i);
                if (diff <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

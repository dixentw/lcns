package idv.lc.array;

import java.util.*;

class ThirdMax{
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for(int i=0; i<nums.length; i++){
            Integer n = nums[i];
            if(n.equals(first) || n.equals(second) || n.equals(third)){
                continue;
            }
            if(first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }else if(second == null || n > second){
                third = second;
                second = n;
            }else if(third == null || n > third) {
                third = n;
            }
        }
        if(third == null) {
            return first;
        }else{
            return third;
        }
    }
}

package idv.lc.misc;

import java.util.*;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> m = new HashSet<>();
        for (int i=0; i< nums1.length; i++) {
            m.add(nums1[i]);
        }
        Set<Integer> res = new HashSet<>();
        for (int i=0; i<nums2.length; i++) {
            if (m.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] resArr = new int[res.size()];
        int i=0;
        for (int num : res) resArr[i++] = num;
        return resArr;

    }
}

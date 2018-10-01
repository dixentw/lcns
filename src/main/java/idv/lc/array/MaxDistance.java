package idv.lc.array;

import java.util.*;

public class MaxDistance {
    public int maxDistance(List<List<Integer>> arrays) {
        int smallest = arrays.get(0).get(0);
        int largest = arrays.get(0).get(arrays.get(0).size()-1);
        int res = Integer.MIN_VALUE;
        int i=0;
        for (List<Integer> arr : arrays) {
            if (i > 0) {
                res = Math.max(res, largest - arr.get(0));
                res = Math.max(res, arr.get(arr.size()-1) - smallest);
                smallest = Math.min(smallest, arr.get(0));
                largest = Math.max(largest, arr.get(arr.size()-1));
            }
            i++;
        }
        return res;
    }
}

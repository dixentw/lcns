package idv.lc.array;

import java.util.*;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<Integer>(), k , n, 1);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> path, int k, int n, int start) {
        if (path.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<Integer>(path));
            }
            return;
        }
        for (int i=start; i<=9; i++) {
            path.add(i);
            helper(result, path, k, n-i, i+1);
            path.remove(path.size()-1);
        }
    }
}

package idv.lc.array;

import java.util.*;

public class BeautifulArr {
    public int countArrangement(int N) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), N);
        return res.size();
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int N) {
        if (path.size() == N) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i=1; i<=N; i++) {
            if (path.contains(i)) {
                continue;
            }
            if (i % (path.size()+1) != 0 && (path.size()+1) % i !=0) {
                continue;
            }
            path.add(i);
            helper(res, path, N);
            path.remove(path.size() - 1);
        }
    }
}

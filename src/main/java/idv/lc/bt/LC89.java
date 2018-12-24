package idv.lc.bt;

import java.util.*;

public class LC89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        if (n==0) return res;
        res.add(1);
        for (int i=2; i< (1<<n); i=i<<1) {
            for (int j=i-1; j>=0; j--) {
                res.add(res.get(j));
            }
            for (int j=i; j<res.size(); j++) {
                res.set(j, res.get(j)+i);
            }
        }
        return res;
    }
}

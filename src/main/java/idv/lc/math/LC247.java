package idv.lc.math;

import java.util.*;

public class LC247 {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }
    public List<String> helper(int i, int n) {
        if (i == 0) return Arrays.asList("");
        if (i == 1) return Arrays.asList("0", "1", "8");
        List<String> res = new ArrayList<>();
        List<String> prev = helper(i-2, n);
        for (String s : prev) {
            if (i != n) res.add("0" + s + "0");
            res.add("1" + s+ "1");
            res.add("6" + s+ "9");
            res.add("9" + s+ "6");
            res.add("8" + s+ "8");
        }
        return res;
    }
}

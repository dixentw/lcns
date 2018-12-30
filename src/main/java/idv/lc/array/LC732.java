package idv.lc.array;

import java.util.*;

public class LC732 {
    TreeMap<Integer, Integer> timeLine = new TreeMap<>();

    public LC732 () {

    }

    public int book(int start, int end) {
        timeLine.put(start, timeLine.getOrDefault(start, 0) + 1);
        timeLine.put(end, timeLine.getOrDefault(end, 0) - 1);
        int cnt = 0;
        int max = 0;
        for (int v : timeLine.values()) {
            cnt += v;
            max = Math.max(max, cnt);
        }
        return max;
    }
}

package idv.lc.sort;

import java.util.*;

public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class LC57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int idx = 0;
        while (intervals.get(idx).end < newInterval.start) idx++;
        int start = newInterval.start;
        int end = newInterval.end;
        while (idx < intervals.length && intervals.get(idx).start < newInterval.end) {
            start = Math.min(intervals.get(idx).start, start);
            end = Math.max(intervals.get(idx).end, end);
            intervals.remove(idx);
        }
        intervals.add(idx, new Interval(start, end));
        return intervals;
    }
}

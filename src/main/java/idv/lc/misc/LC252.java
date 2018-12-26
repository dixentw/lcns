package idv.lc.misc;

import java.util.*;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class LC252 {
    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (Interval a, Interval b) -> a.start-b.start);
        for (int i=1; i<intervals.length; i++) {
            if (intervals[i].start < intervals[i-1].end) return false;
        }
        return true;
    }
    public boolean _canAttendMeetings(Interval[] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i=0; i<intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int endIdx = 0;
        int cnt = 1;
        for (int i=1; i<start.length; i++) {
            if (start[i] < end[endIdx]) {
                cnt++;
            } else {
                endIdx++;
            }
        }
        return cnt<2;
    }
}

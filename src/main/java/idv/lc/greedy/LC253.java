package idv.lc.greedy;

import java.util.*;


class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class LC253 {
    public int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int cnt = 0;
        int endIdx = 0;
        for (int i=0; i<intervals.length; i++) {
            if (starts[i] < ends[endIdx]) {
                cnt++;
            } else {
                endIdx++;
            }
        }
        return cnt;
    }

    public int _minMeetingRooms(Interval[] intervals) {
        if (intervals == null ||intervals.length == 0) return 0;
        Arrays.sort(intervals, (Interval a, Interval b) -> a.start - b.start);
        PriorityQueue<Interval> q = new PriorityQueue<>(intervals.length, (Interval a, Interval b)-> a.end - b.end);
        q.offer(intervals[0]);
        int cnt = 1;
        for (int i=1; i<intervals.length; i++) {
            Interval itr = intervals[i];
            if (itr.start < q.peek().end) cnt++;
            else q.poll();
            q.offer(itr);
            cnt = Math.max(cnt, q.size());
        }
        return cnt;
    }
}

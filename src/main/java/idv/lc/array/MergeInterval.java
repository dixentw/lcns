package idv.lc.array;

import java.util.*;

class Interval {
    int start;
    int end;
    public Interval() {
        start = 0;
        end = 0;
    }
    public Interval(int s, int e) { start = s; end = e; }
    public String toString() {
        return String.valueOf(start) + "," +String.valueOf(end);
    }
}

public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();
        if (intervals.size()==0) {
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval e1, Interval e2) {
                return e1.start - e2.start;
            }
        });
        int currStart = intervals.get(0).start;
        int currEnd = intervals.get(0).end;
        for (int i=1; i<intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start <= currEnd) {
                currEnd = Math.max(currEnd, curr.end);
            } else {
                res.add(new Interval(currStart, currEnd));
                currStart = curr.start;
                currEnd = curr.end;
            }
        }
        res.add(new Interval(currStart, currEnd));
        return res;
    }
    public List<Interval> mergeOld(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();
        if (intervals.size()==0) {
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval e1, Interval e2) {
                return e1.start - e2.start;
            }
        });
        int currStart = intervals.get(0).start;
        int currEnd = intervals.get(0).end;
        for (int i=1; i<intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start <= currEnd) {
                if (curr.end > currEnd) {
                    currEnd = curr.end;
                }
            } else {
                res.add(new Interval(currStart, currEnd));
                currStart = curr.start;
                currEnd = curr.end;
            }
        }
        res.add(new Interval(currStart, currEnd));
        return res;
    }
}

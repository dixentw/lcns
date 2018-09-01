package idv.lc.array;

import java.util.*;

public class MyCalendarTwo {
    private MyCalendar overlap;
    private List<Integer[]> books;

    public MyCalendarTwo() {
        overlap = new MyCalendar();
        books = new ArrayList<Integer[]>();
    }

    public boolean book(int start, int end) {
        for (Integer[] b: books) {
            if (!(b[0]>=end || b[1]<=start)) {
                if (!overlap.book(Math.max(b[0], start), Math.min(b[1], end))) {
                    return false;
                }
            }

        }
        books.add(new Integer[]{start, end});
        return true;
    }
}

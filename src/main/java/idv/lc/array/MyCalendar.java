package idv.lc.array;

import java.util.*;

public class MyCalendar {

    TreeMap<Integer, Integer> tm;
    public MyCalendar() {
        tm = new TreeMap<Integer, Integer>();
    }

    public boolean book(int start, int end) {
        Integer floor = tm.floorKey(start);
        if (floor!=null && tm.get(floor) > start) {// 小於或等於都可以
            return false;
        }
        Integer ceil = tm.ceilingKey(start);
        if (ceil!=null && ceil < end) {//
            return false;
        }
        tm.put(start, end);
        return true;
    }
}

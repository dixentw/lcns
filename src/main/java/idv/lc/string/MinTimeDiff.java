package idv.lc.string;

import java.util.*;

public class MinTimeDiff {
    /*
     * Hour 怎麼減最小？- 後面減前面，如果是負的加24
     * 分小於 12 跟大於12
     * 而且是一堆time point不是只有一個
     *
     * [FAIL]不能A-B, B-C算，A也許等於C更小, 靠，還是依樣，這個要sort才能算中間的最小Diff
     */
    public int findMinDifference(List<String> timePoints) {
        List<Integer> timeMins = new ArrayList<>();
        for (int i=0; i<timePoints.size(); i++) {
            timeMins.add(timeMin(timePoints.get(i)));
        }
        Collections.sort(timeMins, (Integer a, Integer b) -> a - b);

        int min = Integer.MAX_VALUE;
        for (int i=1; i<timeMins.size(); i++) {
            min = Math.min(min, timeMins.get(i) - timeMins.get(i-1));
        }
        int last = timeMins.get(0) + 24*60 - timeMins.get(timeMins.size()-1);
        min = Math.min(min, last);
        return min;
    }
    public int timeMin(String a) {
        String[] timeA = a.split(":");
        return Integer.parseInt(timeA[0])*60 + Integer.parseInt(timeA[1]);
    }
}

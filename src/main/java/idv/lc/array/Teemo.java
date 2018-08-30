package idv.lc.array;

import java.util.*;

public class Teemo {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sec = 0;
        for (int i=1; i<timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i-1];
            if (diff >= duration) {
                sec += duration;
            } else {
                sec += diff;
            }
        }
        sec += duration;
        return sec;
    }
}

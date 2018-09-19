package idv.lc.string;

import java.util.*;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));
        for (int i = 60 * h + m+1; ; i++) {
            String s = String.format("%02d:%02d", i/60%24, i%60);
            if (s.matches("[" +time+ "]+")) {
                return s;
            }
        }
    }
}

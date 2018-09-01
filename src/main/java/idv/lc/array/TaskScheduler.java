package idv.lc.array;

import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        // get repeat first
        int[] cnts = new int[26];
        for (int i=0; i<tasks.length; i++) {
            cnts[tasks[i]-'A']++;
        }
        Arrays.sort(cnts);
        int maxRep = 0;
        for (int i=0; i<25; i++) {
            if (cnts[i] == cnts[25]) maxRep++;
        }
        return Math.max(tasks.length, (cnts[25] - 1) * n + cnts[25] + maxRep);
    }
}

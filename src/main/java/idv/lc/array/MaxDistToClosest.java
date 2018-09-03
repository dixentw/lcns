package idv.lc.array;

import java.util.*;

public class MaxDistToClosest {
    public int maxDistToClosest(int[] seats) {
        int j = 0;
        int start = 0;
        int end = 0;
        int maxZero = 0;
        int maxPrefix = 0;
        int maxSuffix = 0;
        for (int i=0; i<seats.length; i++) {
            if (seats[i] == 1) {
                break;
            }
            maxPrefix++;
        }
        for (int i=seats.length-1; i>=0; i--) {
            if (seats[i] == 1) {
                break;
            }
            maxSuffix++;
        }
        int i = 0;
        while (j < seats.length) {
            while (j<seats.length && seats[j]==0) j++;
            if (j-i > maxZero) {
                start = i;
                end = j;
                maxZero = j-i;
            }
            i = ++j;
        }
        return Math.max(maxPrefix, Math.max(maxSuffix, (maxZero+1)/2));
    }
}

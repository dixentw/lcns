package idv.lc.math;

import java.util.*;

public class LC69 {
    public int mySqrt(int x) {
        long in = x;
        long i = 1;
        while (i*i <= x) {
            i++;
        }
        return (int) i-1;
    }
}

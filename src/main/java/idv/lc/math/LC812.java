package idv.lc.math;

import java.util.*;

public class LC812 {
    public double largestTriangleArea(int[][] points) {
        double max = 0.0;
        for (int[] i : points) {
            for (int[] j : points) {
                for (int[] k : points) {
                    max = Math.max(max, 0.5 * Math.abs(i[0]*j[1] + j[0]*k[1] + k[0]*i[1] - j[0]*i[1] - k[0]*j[1] - i[0]*k[1]));
                }
            }
        }
        return max;
    }
}

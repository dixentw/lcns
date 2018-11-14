package idv.lc.math;

import java.util.*;
class Point {
    int x;
    int y;
    Point() {
        x = 0;y=0;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }
}
public class LC149 {
    public int maxPoints(Point[] points) {
        if (points.length <= 2) return points.length;
        int maxCnt = 0;
        for (int i=0; i<points.length; i++) { // i as base
            Map<String, Integer> slopes = new HashMap<>();
            int samePoint = 1;
            for (int j=0; j<points.length; j++) {
                if (j == i) continue;
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    samePoint++;
                    continue;
                }
                int ne = points[j].y - points[i].y;
                int de = points[j].x - points[i].x;
                int gcd = GCD(ne, de);
                String key = String.valueOf(ne /gcd) + "_" + String.valueOf(de/gcd);
                if (slopes.containsKey(key)) {
                    slopes.put(key, slopes.get(key)+1);
                } else {
                    slopes.put(key, 2);
                }
                maxCnt = Math.max(maxCnt, slopes.get(key));
            }
            maxCnt = Math.max(maxCnt, samePoint);
        }
        return maxCnt;
    }
    public int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a%b);
    }
}

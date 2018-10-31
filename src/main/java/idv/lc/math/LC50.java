package idv.lc.math;

import java.util.*;

public class LC50 {
    public double myPow(double x, int n) { // short
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            return 1 / (x * myPow(x, Integer.MAX_VALUE));
        }
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        double v = myPow(x, n/2);
        if (n%2 ==0) {
            return v*v;
        } else {
            return v*v*x;
        }
    }
    public double myPowMyVer(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            return 1 / (x * myPow(x, Integer.MAX_VALUE));
        }
        boolean sign = false;
        if (n < 0) {
            sign = true;
            n = -n;
        }
        double res = 0.0;
        if (n == 1) {
            res = x;
        } else {
            double v = myPow(x, n/2);
            if (n % 2 == 0) {
                res = v * v;
            } else {
                res = v * v * x;
            }
        }
        if (sign) return 1/res;
        return res;
    }
}

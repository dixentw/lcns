package idv.lc.array;

import java.util.*;

class DivideTwoInt {
    public int divide (int dividend, int divisor) {
        int sign = 1;
        if ((dividend < 0 && divisor > 0 )||(dividend > 0 && divisor < 0)) sign = -1;
        long dd = dividend;
        long ds = divisor;
        dd = Math.abs(dd);
        ds = Math.abs(ds);
        long result = 0;
        if (ds == 1) {
            result = dd;
        } else {
            while (dd >= ds) {
                result++;
                dd -= ds;
            }
        }
        if (sign * result > Integer.MAX_VALUE ||sign * result < Integer.MIN_VALUE ) {
            return Integer.MAX_VALUE;
        }
        return sign * (int)result;
    }
    public int divide0(int dividend, int divisor) {
        int cnt = 0;
        boolean shouldNeg = false;
        long dd = dividend;
        long dr = divisor;
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1) ){
            return Integer.MAX_VALUE;
        }
        if ((dd < 0 && dr > 0) ||(dd >0 && dr <0) ){
            shouldNeg = true;
        }
        if(dd < 0 ) dd = -dd;
        if(dr < 0 ) dr = -dr;
        if (dr == 1) {
            return (shouldNeg)? -(int)dd : (int)dd;
        }
        for(int i=0; i<=dd; i+=dr) {
            cnt++;
        }
        cnt--;
        return (shouldNeg)?-cnt:cnt;
    }
    public int divide1(int dividend, int divisor) {
        // stated corner case
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1) ){
            return Integer.MAX_VALUE;
        }
        boolean shouldNeg = false;
        long dd = dividend;
        long dr = divisor;
        if ((dd < 0 && dr > 0) ||(dd >0 && dr <0) ){
            shouldNeg = true;
        }
        if(dd < 0 ) dd = -dd;
        if(dr < 0 ) dr = -dr;
        int res = 0;
        while(dd >= dr) {
            long tmp = dr;
            long multiple = 1;
            while(dd >= (tmp << 1)) {
                tmp = tmp << 1;
                multiple = multiple << 1;
            }
            dd -= tmp;
            res += multiple;
        }
        return (shouldNeg)?-res:res;
    }
}

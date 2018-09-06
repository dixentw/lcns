package idv.lc.string;

import java.util.*;

public class ATOI {
    public int myAtoi(String str) {
        long result = 0;
        int sign = 1;
        int i=0;
        str = str.trim();
        if (str.length()==0) return 0;
        if (str.charAt(i) == '+'|| str.charAt(i) == '-') {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        while (i < str.length()) {
            if (str.charAt(i)-'0' >= 0 && str.charAt(i)-'0' <= 9) {
                int digit = str.charAt(i)-'0';
                result = result*10 + digit;
                if (sign == 1 && result > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (sign == -1 && (-1) * result < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                i++;
            } else {
                break;
            }
        }
        return sign * (int) result;
    }
}

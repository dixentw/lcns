package idv.lc.string;

import java.util.*;

public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] DP = new int[n];
        DP[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i=1; i<DP.length; i++) {
            int single = s.charAt(i) - '0';
            if (single>=1 && single<=9) {
                DP[i] += DP[i-1];
            }
            int db = Integer.parseInt(s.substring(i-1, i+1));
            if (db>=10 && db<=26) {
                DP[i] += (i-2 < 0)? 1: DP[i-2];
            }
        }
        return DP[n-1];
    }
    public int numDecodings0(String s) {
        int res = 1;
        int i = 0;
        while (i < s.length()-1) {
            int seq = Integer.parseInt(s.substring(i, i+2));
            if (seq >=10 && seq <=26) {
                res++;
            }
            i++;
        }
        return res;
    }
}

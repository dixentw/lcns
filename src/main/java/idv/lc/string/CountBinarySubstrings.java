package idv.lc.string;

import java.util.*;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int cnt = 0;
        int curr = 1; //curr 1 or 0's length
        int prev = 0; // previous consecutive 1 or 0's length
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }
            if (prev >= curr) cnt++; //神操作： 001先算一次, 0011再算一次沒有漏掉
        }
        return cnt;
    }
    public int countBinarySubstringsWIP(String s) {
        int count = 0;
        for (int i=0; i<s.length()-1; i++) {
            int end = i+1;
            int elmCnt = 1;
            boolean flip = false;
            while (end<s.length()) {
                if (s.charAt(end)!=s.charAt(end-1)) {
                    flip = true;
                    elmCnt--;
                } else {
                    elmCnt++;
                    end++;
                }
                if (elmCnt==0) {
                        count++;
                        break;
                    }
            }
            if (elmCnt==0) count++;
        }
        return count;
    }
}

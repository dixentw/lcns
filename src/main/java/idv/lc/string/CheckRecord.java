package idv.lc.string;

import java.util.*;

public class CheckRecord {
    /*
     * 沒看清楚題目的意思，是連續LLL才回傳false
     */
    public boolean checkRecord(String s) {
        int absent = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') absent++;
        }
        if (absent > 1 || s.indexOf("LLL")!=-1) {
            return false;
        } else {
            return true;
        }
    }
}

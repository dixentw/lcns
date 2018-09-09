package idv.lc.string;

import java.util.*;

public class LastWordLen {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
    public int lengthOfLastWord_noAPI(String s) {
        s = s.trim();
        int spaceIdx = -1;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIdx = i;
            }
        }
        if (spaceIdx == -1) {
            return s.length();
        }
        return s.length() - (spaceIdx + 1);
    }
}

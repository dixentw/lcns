package idv.lc.string;

import java.util.*;

public class ExpressiveWords {
    public int expressiveWords(String S, String[] words) {
        int count = 0;
        for (String w : words) {
            int i = 0;
            int j = 0;
            while (i<S.length() && j<w.length() && S.charAt(i)==w.charAt(j)) {
                int lenS = 1;
                int lenW = 1;
                while (i<S.length()-1&&S.charAt(i)==S.charAt(i+1)) {
                    i++;
                    lenS++;
                }
                while (j<w.length()-1&&w.charAt(j)==w.charAt(j+1)) {
                    j++;
                    lenW++;
                }
                if (lenS < lenW || lenS > lenW && lenS < 3) break;
                i++;
                j++;
            }
            if (i==S.length() && j==w.length()) count++;
        }
        return count;
    }
}

package idv.lc.array;

import java.util.*;

public class ShortestDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int prev = -1;
        String pWord = "";
        for (int i=0; i< words.length; i++) {
            if (words[i].equals(word1) || words[i].equals(word2)) {
                if (pWord != "" && !words[i].equals(pWord)) {
                    min = Math.min(min, i - prev);
                }
                prev = i;
                pWord = words[i];
            }
        }
        return min;
    }
}

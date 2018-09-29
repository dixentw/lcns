package idv.lc.array;

import java.util.*;

public class ShortestDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        List<Integer> w1 = new ArrayList<>();
        List<Integer> w2 = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word1)) {
                w1.add(i);
            } else if (words[i].equals(word2)) {
                w2.add(i);
            }
        }
        for (int i=0, j=0; i<w1.size()&&j<w2.size();) {
            if (w1.get(i) < w2.get(j)) {
                min = Math.min(min, w2.get(j) - w1.get(i));
                i++;
            } else {
                min = Math.min(min, w1.get(i) - w2.get(j));
                j++;
            }
        }
        return min;
    }
    public int shortestDistanceTTT(String[] words, String word1, String word2) {
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

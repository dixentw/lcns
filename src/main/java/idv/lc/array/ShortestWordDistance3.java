package idv.lc.array;

import java.util.*;

public class ShortestWordDistance3 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        List<Integer> w1 = new ArrayList<>();
        List<Integer> w2 = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word1)) {
                w1.add(i);
            }
            if (words[i].equals(word2)) {
                w2.add(i);
            }
        }
        int res = Integer.MAX_VALUE;
        if (word1.equals(word2)) {
            for (int i=1; i<w1.size(); i++) {
                res = Math.min(res, w1.get(i) - w1.get(i-1));
            }
        } else {
            for (int i=0, j=0; i<w1.size() && j<w2.size();) {
                if (w1.get(i) < w2.get(j)) {
                    res = Math.min(res, w2.get(j) - w1.get(i));
                    i++;
                } else {
                    res = Math.min(res, w1.get(i) - w2.get(j));
                    j++;
                }
            }
        }
        return res;
    }
}

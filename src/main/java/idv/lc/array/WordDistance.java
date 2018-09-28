package idv.lc.array;

import java.util.*;

public class WordDistance {
    // words, and all position of this words
    Map<String, List<Integer>> distances;

    public WordDistance(String[] words) {
        this.distances = new HashMap<>();
        for (int i=0; i< words.length; i++) {
            if (this.distances.containsKey(words[i])) {
                distances.get(words[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                distances.put(words[i], list);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> list1 = distances.get(word1);
        List<Integer> list2 = distances.get(word2);
        int res = Integer.MAX_VALUE;
        for (int i=0, j=0; i<list1.size() && j<list2.size();) {
            if (list1.get(i) < list2.get(j)) {
                res = Math.min(res, list2.get(j) - list1.get(i));
                i++;
            } else {
                res = Math.min(res, list1.get(i) - list2.get(j));
                j++;
            }
        }
        return res;
    }
}

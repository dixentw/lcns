package idv.lc.string;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordMap = new HashMap<>();
        Set<String> ban = new HashSet<>();
        for (String b : banned) {
            ban.add(b);
        }
        String[] tokens = paragraph.split("[\\s!?',;\\.]");
        for (String token : tokens) {
            String tmp = token.toLowerCase();
            if (token.length()==0 || ban.contains(token)) continue;
            wordMap.put(tmp, wordMap.getOrDefault(tmp, 0)+1);
        }
        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(wordMap.entrySet());
        Collections.sort(list, (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> b.getValue() - a.getValue());
        if (list.size()==0) return "";
        return list.get(0).getKey();
    }
}

package idv.lc.string;

import java.util.*;

public class ReorganizeString {

    public String reorganizeString(String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b)-> b.getValue()- a.getValue());//[FAIL]
        int sum = 0;
        for (Map.Entry<Character, Integer> e : entries) {
            sum += e.getValue();
        }
        if (entries.get(0).getValue() > (sum+1)/2) return "";
        char[] ans = new char[S.length()];
        int i = 0;
        int maxCnt = entries.get(0).getValue();
        while (maxCnt-- > 0) {
            ans[i] = entries.get(0).getKey();
            i += 2;
        }
        for (int j=1; j<entries.size(); j++) {
            int cnt = entries.get(j).getValue();//[FAIL]
            while (cnt-- > 0) {//[FAIL]
                if (i>=ans.length) {
                    i=1;
                }
                ans[i] = entries.get(j).getKey();//[FAIL]
                i+=2;
            }
        }
        return new String(ans);
    }
}

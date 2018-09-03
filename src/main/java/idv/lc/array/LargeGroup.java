package idv.lc.array;

import java.util.*;

public class LargeGroup {
    public List<List<Integer>> largeGroupPositions(String S) {
        int start = 0;
        int end = 0;
        List<List<Integer>> res = new ArrayList<>();
        while (end < S.length()) {
            while(end < S.length() && S.charAt(start) == S.charAt(end)) end++;
            if (end - start >=3) {
                res.add(Arrays.asList(start, end-1));
            }
            start = end;
        }
        return res;
    }
    public List<List<Integer>> largeGroupPositionsOld(String S) {
        int[] ws = new int[26];
        int[] begin = new int[26];
        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(ws[c-'a'] == 0 ){
                begin[c-'a'] = i;
            }
            ws[c-'a']++;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<ws.length; i++) {
            if (ws[i] >= 3) {
                Integer[] e = new Integer[2];
                e[0] = begin[i];
                e[1] = begin[i] + ws[i] - 1;
                res.add(Arrays.asList(e));
            }
        }
        return res;
    }
}

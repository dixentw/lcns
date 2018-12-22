package idv.lc.string;

import java.util.*;

public class LC763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int[] map = new int[26];
        for (int i=0; i<S.length(); i++) {
            map[S.charAt(i)-'a'] = i;
        }
        int last = 0;
        int start = 0;
        for (int i = 0; i<S.length(); i++) {
            last = Math.max(last, map[S.charAt(i)-'a']);
            if (last == i) {
                res.add(last - start+1);
                start = last + 1;
            }
        }
        return res;
    }
    public List<Integer> _partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (end < S.length()) {
            int fur = end;
            while (fur<S.length() && S.charAt(start) != S.charAt(fur)) {
                end++;
            }
            if (end == S.length()) {
                res.add(1);
                start++;
            } else {
                Set<Character> c = new HashSet<>();
                for (int i=start; i<=end; i++) c.add(S.charAt(i));
                while (end < S.length() && c.contains(S.charAt(end))) {
                    end++;
                }
                res.add(end-start);
                start = end;
            }
        }
        if (end != start) res.add(end-start);
        return res;
    }
}

package idv.lc.string;

import java.util.*;

public class FindReplaceString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        StringBuilder sb = new StringBuilder();
        List<Integer[]> idxes = new ArrayList<>();
        for (int i=0; i< indexes.length; i++) {
            idxes.add(new Integer[]{indexes[i], i});
        }
        Collections.sort(idxes, (Integer[] a, Integer[] b) -> b[0]-a[0]);
        int start = 0;
        for (Integer[] ids : idxes) {
            int i = ids[0];
            int j = ids[1];
            String s = sources[j];
            String t = targets[j];
            if (S.substring(i, i+s.length()).equals(s)) {
                S = S.substring(0, i) + t + S.substring(i+s.length());
            }
        }
        return S;
    }
}


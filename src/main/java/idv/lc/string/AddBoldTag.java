package idv.lc.string;

import java.util.*;

public class AddBoldTag {
    /*
     * naive :使用dict去matching 每個dic的位置，然後merge起來放bold tag
     * 怎麼解決pattern重複的問題？while loop?
     *
     * 更簡單的做法：每個s的char去對dict, 這邊有個訣竅
     * s.startWith(dict_ptn, i)
     */
    public String addBoldTag(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];
        int end = 0;
        for (int i=0 ; i<s.length(); i++) {
            for (String d : dict) {
                if (s.indexOf(d, i)==i) {
                    end = Math.max(end, i+d.length()); //check for mergable
                }
            }
            bold[i] = end > i;
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(bold));
        for (int i=0; i<s.length(); i++) {
            if (!bold[i]) {
                sb.append(s.charAt(i));
                continue;
            }
            int j = i;
            while(j <s.length() && bold[j]) j++;
            sb.append("<b>" + s.substring(i, j)+"</b>");
            i = j-1; //[FAIL]沒想到要重設下去
        }
        return sb.toString();
    }

    public String addBoldTag_Merge(String s, String[] dict) {
        List<Integer[]> pos = new ArrayList<>();
        for (String d : dict) {
            int idx = s.indexOf(d);
            while (idx!=-1) {
                pos.add(new Integer[]{idx, idx+d.length()});//make it exclusive, can be useful for merging
                idx = s.indexOf(d, ++idx);
            }
        }
        if (pos.size() ==0 )return s; //[FAIL] 沒考慮no match的可能！
        Collections.sort(pos, (Integer[] a, Integer[] b) -> a[0] - b[0]);
        List<Integer[]> merge = new ArrayList<>();
        int start = pos.get(0)[0];
        int end = pos.get(0)[1];
        for (int i=0; i< pos.size(); i++) {
            if (pos.get(i)[0] <= end) {
                end = Math.max(end, pos.get(i)[1]);
            } else {
                merge.add(new Integer[]{start, end});
                start = pos.get(i)[0];
                end = pos.get(i)[1];
            }
        }
        merge.add(new Integer[]{start, end});
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for (Integer[] p : merge) {
            sb.append(s.substring(prev, p[0]));
            sb.append("<b>");
            sb.append(s.substring(p[0], p[1]));
            sb.append("</b>");
            prev = p[1];
        }
        sb.append(s.substring(prev, s.length()));
        return sb.toString();
    }
}

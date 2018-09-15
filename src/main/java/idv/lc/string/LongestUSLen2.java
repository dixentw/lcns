package idv.lc.string;

import java.util.*;

public class LongestUSLen2 {
    /*
     * 從1來看就是把這批string裡面找最長的丟出去,還要判斷誰是一樣
     * 怎麼判斷誰是依樣？
     *
     * using Set, put all strings to set and check them in set 天啊怎麼會連這個都不會!
     *
     * 思路如下：找最長，而且不重複的丟出去，所以如果最長的是重複的，那就要往不那麼長的找，但是這時候就要避開，不那麼長的string 是長的subsequence
     *
     * Seconds,可以使用hashMap, 記下duplication
     *
     */

    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Set<String> dups = getDups(strs);
        for (int i=0; i<strs.length; i++) {
            if(!dups.contains(strs[i])) {
                if (i==0) return strs[i].length();
                for (int j=0; j<i; j++) {
                    if (isSubSeq(strs[j], strs[i])) break;
                    if (j==i-1) return strs[i].length();
                }
            }
        }
        return -1;
    }

    public boolean isSubSeq (String a, String b) {
        int i=0;
        int j=0;
        while (i < a.length() && j < b.length()) {
            if(a.charAt(i) == b.charAt(j)) j++;
            i++;
        }
        return j == b.length();
    }

    public Set<String> getDups (String[] strs) {
        Set<String> checker = new HashSet<String>();
        Set<String> dup = new HashSet<String>();
        for (String ss : strs) {
            if (checker.contains(ss)) dup.add(ss);
            checker.add(ss);
        }
        return dup;
    }
}

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
     * Seconds,可以使用hashMap, 記下duplication, 然後再回過頭去，如果是別人的subsequence, 就標成false
     *
     */

    public int findLUSlength(String[] strs) {
        Map<String, Boolean> map = new HashMap<>();
        for (String ss : strs) {
            if (map.containsKey(ss)) {
                map.put(ss, false);
            } else {
                map.put(ss, true);
            }
        }
        //只看出現一次的string，是不是別人的subsequence
        for (Map.Entry<String, Boolean> e : map.entrySet()) {
            if (e.getValue()) {
                for (Map.Entry<String, Boolean> inner : map.entrySet()) {
                    //System.out.printf("e: %s, in: %s\n", e.getKey(), inner.getKey());
                    //會找到自己，所以限定是false才檢查
                    //有點不靠譜，我怎麼知道e.getKey是不是另外一個不重複的e.getKey subsequence?
                    //或者說，只match false也可以，因為如果你是別人的subSeq, 你一定小於那個seq，所以我們只要檢查是不是在dup就好了
                    //But String len? 這沒排序啊？isSubSeq是假設前面string 長度大於後面string的欸
                    // [2018/09/16] 
                    // * 只看出現一次的string，是不是別人的subsequence, 這裡只看是不是重複string的subsequence, 暫時都不考慮長度
                    // * 如果某string x, 是 string y的subsequence, x, y均不是重複，那在最後的find max, 還是會取y，所以不用煩惱這些string 是不是非重複的subsequence
                    // 這個邏輯跟I是一樣的，就算a是b的subsequence, longest uncommon subsequence還是b
                    if (!inner.getValue() && isSubSeq(inner.getKey(), e.getKey())) {
                        e.setValue(false);
                        break;
                    }
                }
            }
        }
        int max = -1;
        for (Map.Entry<String, Boolean> entry : map.entrySet())
            if (entry.getValue()) max = Math.max (max, entry.getKey().length());
        return max;

    }

    public int findLUSlengthOLD(String[] strs) {
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

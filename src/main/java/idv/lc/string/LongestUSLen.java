package idv.lc.string;

import java.util.*;

public class LongestUSLen {
    /*
     * 不能從頭比對，有點像是找longest comon sequence, 用start and end去比，留最大的len
     * 先做出可以比一樣長度的，在考慮a, b不等長
     * How about a shorter than b?, 當到達短的最後，compare應該就停了？不對，後面可能有更長的
     *
     * 看了解答後，更疑惑了...
     * 只需要判斷a, b是不是一樣的，如果不一樣，就return 最大長度即可？為何？為何？
     *  => by defination : subsequence 是 任何string 刪掉任何character，不改變其order的string
     *  也就是說，我們如果要找最長的subsequence, 其實就是input string 本人（不做任何修改就是最長subsequence)
     *  所以，我們把兩個最長的subsequence拿來比就是答案了....
     */
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
    public int findLUSlengthOLD(String a, String b) {
        int start = 0;
        int end = 0;
        int maxLen = 0;
        while (end < a.length()) {
            if (a.charAt(end) != b.charAt(end)) {
                end++;
                maxLen = Math.max(maxLen, end-start);
            } else {
                end++;
                start=end;
            }
        }
        return maxLen;
    }
}

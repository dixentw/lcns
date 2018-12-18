package idv.lc.dp;

import java.util.*;

public class LC139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] DP = new boolean[s.length()+1];
        DP[0] = true;
        for (int i=1; i<=s.length(); i++) {
            for (String w : wordDict) {
                if (i < w.length()) continue;
                if (DP[i - w.length()]) {
                    if (w.equals(s.substring(i - w.length(), i))) {
                        DP[i] = true;
                        break;
                    }
                }
            }
        }
        return DP[s.length()];
    }
}

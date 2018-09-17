package idv.lc.string;

import java.util.*;

public class MinDistance {
    /*
     * 只使用delete
     * 怎麼找出哪個characters要刪掉？
     * 如果兩字串不等長，刪掉長的
     * 兩字串等長，sort後 刪掉不同的
     *
     * 或先sort過後，直接找從那邊 , 但是好像不好用
     *  使用map應該不錯,直接找出不重複就好了
     *  1. 重複怎麼辦？
     *  
     *  看解答：找longest common subsequence
     *  使用seq align的DP
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] DP =  new int[m+1][n+1];
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i==0||j==0) {
                    DP[i][j] =0;
                    continue;
                }
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    DP[i][j] = DP[i-1][j-1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
                }
            }
        }
        int val = DP[m][n];
        return m-val + n-val;
    }
}

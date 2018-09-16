package idv.lc.string;

import java.util.*;

public class SplitLoopedString {
    /*
     * 暴力法：全列出來, 找最大的charater 切開 sort, 拿最後一個
     *
     * 用規則決定要不要reverse : 如果後面的lexical > 前面的就reverse, 應該取頭尾比就好了
     * 切開為
     * 如何證明？
     * [FAIL] 有好幾個maxIdx點，怎麼判斷?
     * [FAIL] 假設錯誤，如果不reverse, 接後面的可能可以更大, 回歸窮舉法
     *
     */
    public String splitLoopedString(String[] strs) {
        char max = 'a';
        for (int i=0; i<strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                if (c > max) max = c;
            }
            String rev = new StringBuilder(strs[i]).reverse().toString();
            if (rev.compareTo(strs[i]) > 0) strs[i] = rev;
        }
        //上面的取最大還是要做，因為接下來我們針對每個substring取可能性的時候，
        //其他append進來的string我們要保證他們為最大(因為append進來的無法再改了
        String res = "";
        for (int i=0; i<strs.length; i++) {
            String[] ss = new String[]{strs[i], new StringBuilder(strs[i]).reverse().toString()};
            for (String s : ss) {
                for (int k=0; k<s.length(); k++) {
                    if (s.charAt(k) != max) continue;
                    StringBuilder sb = new StringBuilder(s.substring(k));
                    for (int l=i+1; l<strs.length; l++) sb.append(strs[l]);
                    for (int l=0; l<i; l++) sb.append(strs[l]);
                    sb.append(s.substring(0, k));
                    if (sb.toString().compareTo(res) > 0) res = sb.toString();
                }
            }
        }
        return res;
    }
}

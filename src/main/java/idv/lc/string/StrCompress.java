package idv.lc.string;

import java.util.*;

public class StrCompress {
    /*
     * 使用start and end, 遇到不同的，就end -start
     * 等於一的時候，start = end+1繼續下個迴圈
     *
     * [FAIL] : 當寫完後，後面還有重複的 aaaa > a4aa, 當下寫法會a4a2 XXX
     * [FAIL] : 當寫完後，最後面數字沒有算到，由後面往前算的時候，沒考慮到最後離開while之後，要在檢查一次有沒有最後結果, abcccc就會爆炸
     *
     * 由前面往後推進比較保險
     */
    public int compress(char[] chars) {
        int resIdx = 0;
        int idx = 0;
        while (idx < chars.length) {
            char currChar = chars[idx];
            int cnt = 0;
            while (idx < chars.length && chars[idx] == currChar) {
                idx++;
                cnt++;
            }
            chars[resIdx++] = currChar;
            if (cnt > 1) {
                for (char c: String.valueOf(cnt).toCharArray()) {
                    chars[resIdx++] = c;
                }
            }
        }
        return resIdx;
    }
    public int compressOLD(char[] chars) {
        if (chars.length==0) return 0;
        int start = 0;
        int end = 1;
        while (end < chars.length) {
            if(chars[start] == chars[end]) {
                end++;
            } else {
                int diff = end - start;
                if (diff > 1) {
                    char[] tmp = String.valueOf(diff).toCharArray();
                    for (int i=0; i<tmp.length; i++)
                        chars[++start] = tmp[i];
                }
                start = end;
                end = start+1;
            }
        }
        return start+1;
    }
}

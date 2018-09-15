package idv.lc.string;

import java.util.*;

public class ReverseWord2 {
    /*
     * 基本上還是個變形，k內都reverse完後，再往下作
     * 題目看不是很懂，基本上是後面還剩多少都全reverse
     * [FAIL] "s.length()-1"
     * [FAIL] 只需要reverse 第一個k, 第三個k, 中間不要reverse
     *  1. 第一次的思路是使用odd boolean, 不過更簡單的辦法是i+=2*k
     */
    public String reverseStr(String s, int k) {
        char[] sc = s.toCharArray();
        for (int i=0; i<s.length(); i+=2*k) {
            int start  = i;
            int end = Math.min(i+k-1, s.length()-1);
            while (start < end) {
                char tmp = sc[start];
                sc[start] = sc[end];
                sc[end] = tmp;
                start++;
                end--;
            }
        }
        return new String(sc);
    }
}

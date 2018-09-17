package idv.lc.string;

import java.util.*;

public class NextGreaterElement {
    /*
     * Next permutation in string form
     *
     */
    public int nextGreaterElement(int n) {
        char[] val = String.valueOf(n).toCharArray();
        int pivot = 0;
        for (int i=val.length-1; i>0; i--) {
            if (val[i] > val[i-1]) {
                pivot = i;
                break; // [FAIL] forget to add break to it!!!
            }
        }
        if (pivot == 0) return -1;
        for (int i=val.length-1; i>=pivot; i--) {
            // 這樣做就可以把後面比他大但又最小的給swap掉
            // Notice! 我們不用找比pivot-1的數字大但是又最小的case
            // ex : 634781 -> 這個例子基本不會出現也不用考慮
            // 因為我們的pivot是從後面做過來的，所以pivot之後
            // 一定是遞升序列，要swap的話，從後面數來第一個大於
            // pivot-1的數字一定是最接近的那個數字
            if (val[i] > val[pivot-1]) {
                char tmp = val[i];
                val[i] = val[pivot-1];
                val[pivot-1] = tmp;
                break;
            }
        }
        Arrays.sort(val, pivot, val.length);
        long res = Long.parseLong(new String(val));
        if (res > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) res;
        }
    }
}

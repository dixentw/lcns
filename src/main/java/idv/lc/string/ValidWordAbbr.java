package idv.lc.string;

import java.util.*;

public class ValidWordAbbr {
    /*  basically use remove characters with number, and place them in any chacters
     * 所以應該是真的要拿兩個出來比
     * 要先建立完整的string from abbr 用*當萬用字元，最後迴圈跑一遍就可以
     *
     * leetcode討論串有看到，只要從abbr出發，是數字就存下來，把index加上去，
     * 是character就判斷當下的index是不是那個character即可
     */
    public boolean validWordAbbreviation(String word, String abbr) {
        int num = 0;
        int index = 0;
        for (int i=0; i<abbr.length(); i++) {
            if (Character.isDigit(abbr.charAt(i))) {
                if (abbr.charAt(i) == '0' && num==0) return false;// "a", "01", ["abbreviation", "a10n"] 必須要leading zero
                num = num*10 + abbr.charAt(i) - '0';
            } else { // character case
                index += num;
                if (index >= word.length()) return false; // "hi", "2i"
                if (word.charAt(index) != abbr.charAt(i)) {
                    return false;
                }
                index++;
                num = 0;
            }
        }
        // remaining case
        if (num != 0) {
            return index+num == word.length();
        }
        return true;
    }
}

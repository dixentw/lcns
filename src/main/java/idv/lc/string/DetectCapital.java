package idv.lc.string;

import java.util.*;

public class DetectCapital {
    /*
     * 三個選項,  要不全大寫，要不全小寫，要不第一個大寫
     */
    public boolean detectCapitalUse(String word) {
        if (word.matches("^[a-z]+$")) {
            return true;
        } else if (word.matches("^[A-Z]+")) {
            return true;
        } else if (word.matches("^[A-Z]{1}[a-z]+$")) {
            return true;
        } else {
            return false;
        }
    }
}

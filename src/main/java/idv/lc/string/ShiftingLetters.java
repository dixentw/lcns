package idv.lc.string;

import java.util.*;

public class ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        char[] cs = S.toCharArray();
        for (int i=shifts.length-2; i>=0; i--) {
            shifts[i] = (shifts[i] + shifts[i+1]) % 26;
        }
        for (int i=0; i<shifts.length; i++) {// not every good
            char origin = cs[i];
            cs[i] = (char)((origin - 'a' + shifts[i]) % 26 + 'a');
        }
        return new String(cs);
    }
    public String shiftingLettersOLD(String S, int[] shifts) {
        char[] cs = S.toCharArray();
        for (int i=0; i<shifts.length; i++) {// not every good
            for (int j=0; j<i+1; j++) {
                char origin = cs[j];
                int c = shifts[i] % 26;
                if ((char) (origin + c) > 'z') {
                    cs[j] = (char) ('a' + origin + c - 'z' - 1); //ugliy
                } else {
                    cs[j] = (char)(origin + c);
                }
            }
        }
        return new String(cs);
    }
}

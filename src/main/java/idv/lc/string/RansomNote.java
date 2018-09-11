package idv.lc.string;

import java.util.*;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for (int i=0; i<magazine.length(); i++) {
            mag[magazine.charAt(i)-'a']++;
        }
        for (int i=0; i<ransomNote.length(); i++) {
            mag[ransomNote.charAt(i)-'a']--;
            System.out.println(Arrays.toString(mag));
            if (mag[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

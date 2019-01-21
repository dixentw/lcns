package idv.lc.string;

import java.util.*;

public class LC438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length()>s.length()) return res;
        int[] rune = new int[26];
        for (char c : p.toCharArray()) rune[c-'a']++;

        int start = 0;
        int end = 0;
        int counter = p.length();
        while (end < s.length()) {
            if (rune[s.charAt(end)-'a'] >= 1) counter--;
            rune[s.charAt(end)-'a']--;
            end++;
            if (end-start==p.length()){
                if (counter == 0) res.add(start);
                if(rune[s.charAt(start)-'a'] >= 0) counter++;
                rune[s.charAt(start)-'a']++;
                start++;
            }
        }
        return res;
    }
    public List<Integer> _findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length()>s.length()) return res;
        for (int i=0; i<=s.length()-p.length(); i++) {
            String sub = s.substring(i, i+p.length());
            if (isAnagram(sub, p)) res.add(i);
        }
        return res;
    }
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        String rune1 = new String(cs);
        return t.equals(rune1);
    }
}

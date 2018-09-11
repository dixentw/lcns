package idv.lc.string;

import java.util.*;

public class ReverseVowel {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
        char[] sc = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            while(!vowels.contains(sc[start]) && start<end) start++;
            while(!vowels.contains(sc[end]) && start<end) end--;
            System.out.printf("start %d, end %d\n", start, end);
            char tmp = sc[start];
            sc[start] = sc[end];
            sc[end] = tmp;
            start++;
            end--;
        }
        return new String(sc);
    }
}

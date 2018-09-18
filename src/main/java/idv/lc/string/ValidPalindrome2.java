package idv.lc.string;

import java.util.*;

public class ValidPalindrome2 {
    /*
     * naive : delete each character in s and judge if it is palindrome
     * order : O(n^2)
     *
     * * maybe directly run palindrome check with miss count
     * problem : which one should move? if no one can move then
     * it is not palindrome.
     * Problem : we changed the even or odd length, is that ok?
     *
     * [FAIL] forgot start++ and end-- at the end of while
     * [FAIL]
     */
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return validSub(s, start+1, end) || validSub(s, start, end-1);
            }
        }
        return true;
    }
    public boolean validSub(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public boolean validPalindromeOldBug(String s) {
        int start = 0;
        int end = s.length()-1;
        int miss = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if (s.charAt(start+1) == s.charAt(end)) {
                    start++;
                } else if (s.charAt(start) == s.charAt(end-1)) {
                    end--;
                } else if (end-start <= 1) {
                    break;
                } else {
                    System.out.printf("!!!! %d, %d\n", start, end);
                    return false;
                }
                miss++;
            }
            start++;
            end--;
        }
        System.out.printf("--------> %d\n", miss);
        return miss <= 1;
    }
}

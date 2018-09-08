package idv.lc.string;

import java.util.*;

public class LetterCombi {
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        helper(res, new StringBuilder(), digits, 0);
        return res;
    }
    // smaller memory footprint
    public void helper(List<String> res, StringBuilder path, String digits, int index) {
        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }
        String mapping = map[digits.charAt(index) - '0'];
        for (int i=0; i<mapping.length(); i++) {
            helper(res, path.append(mapping.charAt(i)), digits, index+1);
            path.deleteCharAt(path.length()-1);
        }
    }
    public void helper0(List<String> res, String path, String digits, int index) {
        if (index == digits.length()) {
            res.add(path);
            return;
        }
        String mapping = map[digits.charAt(index) - '0'];
        for (int i=0; i<mapping.length(); i++) {
            helper0(res, path+String.valueOf(mapping.charAt(i)), digits, index+1);
        }
    }
    public List<String> letterCombinations1(String digits) {
        if (digits.length() ==  0) {
            return new ArrayList<String>();
        }
        char c = digits.charAt(0);
        digits = digits.substring(1);
        List<String> tmp = letterCombinations(digits);
        List<String> res = new ArrayList<>();
        String mapping = map[c-'0'];
        for (char m : mapping.toCharArray()) {
            if (tmp.size()==0) {
                res.add(String.valueOf(m));
            } else {
                for (int i=0; i<tmp.size(); i++) {
                    res.add(String.valueOf(m) + tmp.get(i));
                }
            }
        }
        return res;
    }
}

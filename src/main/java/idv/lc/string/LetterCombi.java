package idv.lc.string;

import java.util.*;

public class LetterCombi {
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList();
        if(digits == null || digits.length()==0)
            return result;
        helper(result,digits, new StringBuilder(),0);
        return result;
    }
    private void helper(List<String> result, String digits, StringBuilder runStr, int idx){
        if(idx == digits.length()){
            result.add(runStr.toString());
            return;
        }
        char[] chars = map[digits.charAt(idx)-'0'].toCharArray();
        for(char c : chars){
            helper(result,digits, runStr.append(c),idx+1);
            runStr.deleteCharAt(runStr.length()-1);
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

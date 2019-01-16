package idv.lc.dfs;

import java.util.*;

public class LC301 {
    public List<String> removeInvalidParentheses(String s) {
        int lc = 0;
        int rc = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                lc++;
            } else if (s.charAt(i) == ')') {
                if (lc!=0) lc--;
                else rc++;
            }
        }
        Set<String> res = new HashSet<>();
        remove(s, res, 0, new StringBuilder(), lc, rc, 0);
        return new ArrayList<>(res);
    }
    public void remove(String s, Set<String> res, int i, StringBuilder path, int lc, int rc, int open){
        if (lc < 0 || rc < 0 || open < 0) return;
        if (i==s.length()) {
            if (lc == 0 && rc == 0 && open == 0) {
                res.add(path.toString());
            }
            return;
        }
        System.out.println(path.toString());
        int curLen = path.length();
        if (s.charAt(i)=='(') {
            remove(s, res, i+1, path.append('('), lc, rc, open+1);
            remove(s, res, i+1, path, lc-1, rc, open);
        } else if (s.charAt(i) ==')') {
            remove(s, res, i+1, path.append(')'), lc, rc, open-1);
            remove(s, res, i+1, path, lc, rc-1, open);
        } else {
            remove(s, res, i+1, path.append(s.charAt(i)), lc, rc, open);
        }
        path.setLength(curLen);
    }
}

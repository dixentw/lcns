package idv.lc.string;

import java.util.*;

public class GeneratePara {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, "", 0, 0, n);
        return res;
    }
    public void helper(List<String> res, String path, int open, int close, int n) {
        if (path.length() == 2*n) {
            res.add(path);
            return;
        }
        if (open < n) {
            helper(res, path+"(", open+1, close, n);
        }
        if (close < open) {
            helper(res, path+")", open, close+1, n);
        }
    }
}

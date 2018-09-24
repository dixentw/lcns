package idv.lc.string;

import java.util.*;

public class SplitIntoFibonacci {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        helper(res, 0, S);
        return res;
    }
    public boolean helper(List<Integer> res, int index, String S) {
        if (index == S.length() && res.size() >=3) {
            return true;
        }
        for (int i=index; i<S.length(); i++) {
            if (S.charAt(index) == '0' && i>index) { //leading zero is invalid
                break;
            }
            long num = Long.parseLong(S.substring(index, i+1));
            if (num > Integer.MAX_VALUE) break;
            //if (res.size()>=2 && res.get(res.size()-1)+res.get(res.size()-2) < num) break;

            if (res.size() <=1 || num == res.get(res.size()-1) + res.get(res.size()-2)) {
                res.add((int)num);
                if (helper(res, i+1, S)) {
                    return true;
                }
                res.remove(res.size()-1);
            }
        }
        return false;
    }
}

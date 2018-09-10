package idv.lc.string;

import java.util.*;

public class RestoreIpAddr {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        helper(result, new ArrayList<>(), 0, s);
        return result;
    }
    public void helper(List<String> res, List<String> path, int start, String s) {
        if (path.size() == 4) {
            if (start == s.length()) {
                res.add(String.join(".", path));
            }
            return;
        }
        List<String> pathCandid = new ArrayList<String>();
        if (start <= s.length()-1) {
            pathCandid.add(s.substring(start, start+1));
        }
        if (start <= s.length()-2 && s.charAt(start) != '0') {
            pathCandid.add(s.substring(start, start+2));
        }
        if (start <= s.length()-3 && s.charAt(start) != '0') {
            pathCandid.add(s.substring(start, start+3));
        }
        for (int i=0; i<pathCandid.size(); i++) {
            String cand = pathCandid.get(i);
            if (Integer.parseInt(cand) <= 255) {
                path.add(cand);
                helper(res, path, start+cand.length(), s);
                path.remove(path.size()-1);
            }
        }
    }
}

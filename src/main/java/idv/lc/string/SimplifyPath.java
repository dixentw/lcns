package idv.lc.string;

import java.util.*;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String p : path.split("/")) {
            if (p.equals("..")) {
                if (!st.empty()) st.pop();
            } else {
                if (!p.equals(".") && p.length()>0) {
                    st.push(p);
                }
            }
        }
        return "/" + String.join("/", st);
    }
    public String simplifyPath0(String path) {
        List<String> p = new ArrayList<>();
        String[] pp = path.split("/");
        for (String s : pp) {
            if (s.length() != 0) {
                p.add(s);
            }
        }
        List<String> output = new ArrayList<>();
        for (String s : p) {
            if (s.equals("..")) {
                if (output.size()>=1) output.remove(output.size()-1);
            } else if (s.equals(".")) {
                //do nothing about .
            } else {
                output.add(s);
            }
        }
        return "/"+String.join("/", output);
    }
}

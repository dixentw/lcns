package idv.lc.string;

import java.util.*;

public class ValidPara {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(')');
            } else if (s.charAt(i) == '{') {
                st.push('}');
            } else if (s.charAt(i) == '[') {
                st.push(']');
            } else {
                if (st.empty() || (st.peek() != s.charAt(i))) {
                    return false;
                }
                st.pop();
            }
        }
        if (st.size()!=0) {
            return false;
        } else {
            return true;
        }
    }
}

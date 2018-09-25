package idv.lc.string;

import java.util.*;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        Stack<Integer> st = new Stack<>();
        for (int i=0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                st.push(-1); //not evaluated condition
            } else {
                int layer = 0;
                while (st.peek() != -1) {
                    layer += st.pop();
                }
                st.pop();
                st.push(layer==0? 1: layer*2);
            }
        }
        int sum = 0;
        for (Integer i : st) sum += i;
        return sum;
    }
}

package idv.lc.string;

import java.util.*;

public class CheckValidString {
    /*
     * 不需要考慮order嘛？
     * 看起來不用只要數字對的上就好了
     *
     * 1. 可以使用Stack, 外加start count, 當做到後面壞掉的時候就可以補
     * How to prove it correct?
     * Wrong: it didn't consider the order and star, I cannot save star to use it later.
     *
     * we should stack the index of left and start
     * for right p to balance, the for loop is very normal.
     * for remaining part : consider '*' and '('
     * no '(' can appear after '*', becuase we cannot close '(' with '*';
     */
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') left.push(i);
            else if (c== '*') star.push(i);
            else {
                if (left.empty() && star.empty()) return false;
                if (!left.empty()){
                    left.pop();
                } else {
                    star.pop();
                }
            }
        }
        while (!left.empty() && !star.empty()) {
            if (left.pop() > star.pop()) return false;
        }
        return left.empty();
    }

    public boolean checkValidStringFAIL(String s) {
        Stack<Character> st = new Stack<>();
        int star = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(c);
            else if (c== '*') star++;
            else {
                if (st.empty()) star--;
                else st.pop();
            }
        }
        if (st.empty() && star>=0) {
            return true;
        } else if (!st.empty() && st.size() == star) {//[FAIL]st.size<=star
            return true;
        } else {
            return false;
        }
    }
}

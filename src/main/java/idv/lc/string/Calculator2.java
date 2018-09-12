package idv.lc.string;

import java.util.*;

public class Calculator2 {
    public int calculate(String s) {
        s = s.trim();
        int num = 0;
        char sign = '+'; //previous sign status, 我們到了第二個sign才結算前兩個
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
            }
            if (i==s.length()-1 || "+-*/".indexOf(s.charAt(i)) >= 0) { //一定要再進來一次，這樣最後面才會真的結算:w
                if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '+') {
                    stack.push(num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        for(Integer i : stack) res+=i;
        return res;
    }
}

package idv.lc.math;

import java.util.*;

public class LC224 {
    public int calculateClassic(String s) {
        Stack<Integer> eval = new Stack<>();
        List<String> postfix = in2postfix(toStrList(s));
        for (String token : postfix) {
            if (!token.matches("[0-9]+")) {
                int v1 = eval.pop();
                int v2 = eval.pop();
                if (token.equals("+")) {
                    eval.push(v1+v2);
                } else {
                    eval.push(v2-v1);
                }
            } else {
                eval.push(Integer.parseInt(token));
            }
        }
        return eval.pop();
    }
    public List<String> in2postfix(List<String> in) {
        Stack<String> ops = new Stack<>();
        List<String> postfix = new ArrayList<>();
        for (String token : in) {
            if (token.matches("[0-9]+")) {
                postfix.add(token);
            } else if (token.equals("(")) {
                ops.push(token);
            } else if (token.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    postfix.add(ops.pop());
                }
                ops.pop();
            } else {
                while (!ops.isEmpty() && !ops.peek().equals("(")) postfix.add(ops.pop());
                ops.push(token);
            }
        }
        while (!ops.isEmpty()) {
            postfix.add(ops.pop());
        }
        return postfix;
    }
    public List<String> toStrList(String s) {
        List<String> res = new ArrayList<>();
        s = s.replace(" ", "");
        String num = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num += String.valueOf(c);
            } else {
                if (num != "") {
                    res.add(num);
                    num = "";
                }
                res.add(String.valueOf(c));
            }
        }
        if (num != "") res.add(num);
        return res;
    }
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (c -'0');
            } else if (c == '+') {
                res += sign * num ;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                res += sign * num ;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                st.push(res);
                st.push(sign);
                sign = 1;
                res = 0;
            } else if (c == ')') {
                res += sign * num;
                num = 0;
                res *= st.pop();
                res += st.pop();
            }
        }
        if (num != 0) res += sign * num;
        return res;
    }
}

package idv.lc.string;

import java.util.*;

public class LC772 {
    public int calculate(String s) {
        List<String> postfix = in2post(parser(s));
        Stack<Long> eval = new Stack<>();
        for (String token : postfix) {
            if (token.matches("[0-9]+")) {
                eval.push(Long.parseLong(token));
            } else {
                long b = eval.pop();
                long a = eval.pop();
                if (token.equals("+")) {
                    eval.push(a+b);
                } else if (token.equals("-")) {
                    eval.push(a-b);
                } else if (token.equals("*")) {
                    eval.push(a*b);
                } else {
                    eval.push(a/b);
                }
            }
        }
        return eval.pop().intValue();
    }
    public List<String> parser(String s) {
        s = s.replace(" ", "");
        List<String> res = new ArrayList<>();
        String num = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num += String.valueOf(c);
            } else {
                if (!num.equals("")) {
                    res.add(num);
                    num = "";
                }
                res.add(String.valueOf(c));
            }
        }
        if (!num.equals("")) res.add(num);
        return res;
    }
    public List<String> in2post(List<String> in) {
        List<String> res = new ArrayList<>();
        Stack<String> op = new Stack<>();
        for (String token : in) {
            if (token.matches("[0-9]+")) {
                res.add(token);
            } else if (token.equals("(")) {
                op.push(token);
            } else if (token.equals(")")) {
                while (!op.isEmpty() && !op.peek().equals("(")) res.add(op.pop());
                op.pop();
            } else {
                while (!op.isEmpty() && pre(token) <= pre(op.peek())) res.add(op.pop());
                op.push(token);
            }
        }
        while (!op.isEmpty()) res.add(op.pop());
        return res;
    }
    public int pre(String op) {
        int p = 0;
        switch (op) {
            case "(" : p = 0; break;
            case "+" : p = 1; break;
            case "-" : p = 1; break;
            case "*" : p = 2; break;
            case "/" : p = 2; break;
        }
        return p;
    }
}

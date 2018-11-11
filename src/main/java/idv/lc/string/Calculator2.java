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

    public int calculateClassic(String s) {
        List<String> postfix = in2post(parser(s));
        Stack<Integer> eval = new Stack<>();
        for (String token : postfix) {
            if (token.matches("[0-9]+")) {
                eval.push(Integer.parseInt(token));
            } else {
                int b = eval.pop();
                int a = eval.pop();
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
        return eval.pop();
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
            } else { // only +, -, *, / should be considered
                while (!op.isEmpty() && precedence(token) <= precedence(op.peek())) {
                    res.add(op.pop());
                }
                op.push(token);
            }
        }
        while (!op.isEmpty()) res.add(op.pop());
        return res;
    }
    public int precedence(String op) {
        int p = 0;
        switch(op) {
            case "+" : p=1 ; break;
            case "-" : p=1 ; break;
            case "*" : p=2 ; break;
            case "/" : p=2 ; break;
        }
        return p;
    }

}

package idv.lc.stack;

import java.util.*;

public class LC682 {
    public int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<>();
        for (String op : ops) {
            if (op.matches("[\\+\\-]?[0-9]+")) {
                scores.push(Integer.parseInt(op));
            } else if (op.equals("C")) {
                scores.pop();
            } else if (op.equals("D")) {
                scores.push(2*scores.peek());
            } else if (op.equals("+")) {
                int a  = scores.pop();
                int b  = scores.pop();
                scores.push(b);
                scores.push(a);
                scores.push(a+b);
            }
        }
        int sum = 0;
        for (Integer i : scores) {
            sum += i;
        }
        return sum;
    }
}

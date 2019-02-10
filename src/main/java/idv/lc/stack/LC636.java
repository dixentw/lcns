package idv.lc.stack;

import java.util.*;

public class LC636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int prevTime = 0;
        for (String log : logs) {
            String[] d = log.split(":");
            int funcID = Integer.parseInt(d[0]);
            int ts = Integer.parseInt(d[2]);
            if (!st.isEmpty()) res[st.peek()] += ts - prevTime;
            prevTime = ts;
            if (d[1].equals("start")) {
                st.push(funcID);
            } else {
                res[st.peek()]++;
                prevTime++;
                st.pop();
            }
        }
        return res;
    }
}

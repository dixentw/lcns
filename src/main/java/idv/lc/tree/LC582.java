package idv.lc.tree;

import java.util.*;

public class LC582 {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        for (int i=0; i<ppid.size(); i++) {
            adjMap.putIfAbsent(ppid.get(i), new ArrayList<>());
            adjMap.get(ppid.get(i)).add(pid.get(i));
        }
        List<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(kill);
        while (!st.empty()) {
            int curr = st.pop();
            res.add(curr);
            List<Integer> children = adjMap.get(curr);
            if (children == null) continue;
            for (int c :children) {
                st.push(c);
            }
        }
        return res;
    }
}

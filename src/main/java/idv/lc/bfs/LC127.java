package idv.lc.bfs;

import java.util.*;

public class LC127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        Set<String> wl = new HashSet<>(wordList);

        int res = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                String curr = q.poll();
                for (int j=0; j<curr.length(); j++) {
                    char[] tmp = curr.toCharArray();
                    for (char a='a'; a<='z'; a++) {
                        tmp[j] = a;
                        String child = new String(tmp);
                        if (!visited.contains(child) && wl.contains(child)) {
                            if (child.equals(endWord)) return res+1;
                            q.add(child);
                            visited.add(child);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }
}

package idv.lc.bfs;

import java.util.*;

public class LC126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> level = new HashMap<>();
        // BFS traverse first, construct level map.
        Queue<String> q = new LinkedList<>();
        Set<String> wl = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        if (!wl.contains(endWord)) return res;
        q.offer(beginWord);
        level.put(beginWord, 0);
        visited.add(beginWord);
        int lv = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                String curr = q.poll();
                for (int j=0; j<curr.length(); j++) {
                    char[] tmp = curr.toCharArray();
                    for (char a='a'; a<='z'; a++) {
                        tmp[j] = a;
                        String child = new String(tmp);
                        if (!visited.contains(child) && (wl.contains(child) || child.equals(endWord)) ) {
                            level.put(child, lv);
                            visited.add(child);
                            q.offer(child);
                        }
                    }
                }
            }
            lv++;
        }
        dfs(res, level, beginWord, endWord, new ArrayList<>());
        return res;
    }
    public void dfs (List<List<String>> res, Map<String, Integer> lv, String bw, String ew, List<String> path) {
        if (bw.equals(ew)) {
            path.add(bw);
            res.add(path);
            return;
        }
        if (!lv.containsKey(bw)) return;
        int nextLv = lv.get(bw) + 1;
        path.add(bw);
        for (int i=0; i<bw.length(); i++) {
            char[] tmp = bw.toCharArray();
            for (char a='a' ; a<='z'; a++) {
                tmp[i] = a;
                String next = new String(tmp);
                if (lv.containsKey(next) && lv.get(next)==nextLv) {
                    List<String> newPath = new ArrayList<>(path);
                    dfs(res, lv, next, ew, newPath);
                }
            }
        }
    }
}

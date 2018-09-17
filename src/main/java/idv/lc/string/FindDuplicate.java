package idv.lc.string;

import java.util.*;

public class FindDuplicate {
    /*
     * 乍看之下先ignore掉path, 把檔案都看過一遍有重複的再去找path
     * 怎樣算重複？檔名依樣檔案內容不依樣算嗎？裡面有說不會重複
     *
     * 我可以用map存content, 但是沒想到value要用什麼, 在這個例子使用
     * arrayList存有重複的path就可以了
     */
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] strs = path.split("\\s+");
            for (int i=1; i<strs.length; i++) {
                int idx = strs[i].indexOf("(");
                String content = strs[i].substring(idx, strs[i].length()-1);
                String fileName = strs[0] + "/" + strs[i].substring(0,idx);
                List<String> aFileName = map.getOrDefault(content, new ArrayList<String>());
                aFileName.add(fileName);
                map.put(content, aFileName);
            }
        }
        for (String c : map.keySet()) {
            if (map.get(c).size() > 1) {
                res.add(new ArrayList<>(map.get(c)));
            }
        }
        return res;
    }
}

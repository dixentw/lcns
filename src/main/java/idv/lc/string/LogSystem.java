package idv.lc.string;

import java.util.*;

public class LogSystem {
    /*
        可以使用在17用過的，每個granularity都去加
        不過如果retrieve上可以做手腳的話，就不需要多儲存了
        最後還是發現，retrieve的手腳很難做，不如一開始就用多個key的儲存方案
    */
    Map<String, List<Integer>> store;

    public LogSystem() {
        this.store = new HashMap<>();
    }

    public void put(int id, String timestamp) {
        List<Integer> res = this.store.getOrDefault(timestamp, new ArrayList<Integer>());
        res.add(id);
        this.store.put(timestamp, res);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        int x = 0;
        switch (gra){
            case "Year":
                x=4; 
                break;
            case "Month":
                x=7;
                break;
            case "Day":
                x=10;
                break;
            case "Hour":
                x=13;
                break;
            case "Minute":
                x=16;
                break;
            case "Second":
                x=19;
                break;
        }
        s = s.substring(0, x);
        e = e.substring(0, x);
        List<Integer> res = new ArrayList<>();
        for (String key : this.store.keySet()) {
            String subKey = key.substring(0, x); //[FAIL] cannot reuse key variable
            if (subKey.compareTo(s) >= 0 && subKey.compareTo(e) <=0) {
                res.addAll(this.store.get(key));
            }
        }
        return res;
    }
}

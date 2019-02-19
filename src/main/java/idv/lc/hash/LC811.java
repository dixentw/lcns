package idv.lc.hash;

import java.util.*;

public class LC811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String line: cpdomains) {
            String[] data = line.split(" ");
            int count = Integer.parseInt(data[0]);
            String domain = data[1];
            while (domain.contains(".")) {
                map.put(domain, map.getOrDefault(domain,0) + count);
                domain = domain.substring(domain.indexOf('.')+1);
            }
            // last domain name
            map.put(domain, map.getOrDefault(domain,0) + count);
            domain = domain.substring(domain.indexOf('.')+1);
        }
        List<String> res = new ArrayList<>();
        for (String d : map.keySet()) {
            res.add(String.valueOf(map.get(d)) + " " + d);
        }
        return res;
    }
}

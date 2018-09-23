package idv.lc.string;

import java.util.*;

public class ToGoatLatin {
    public String toGoatLatin(String S) {
        String[] parts = S.split("\\s");
        List<String> result = new ArrayList<>();
        for (int i=0; i<parts.length; i++) {
            StringBuilder sb = new StringBuilder(parts[i]);
            if (!parts[i].toLowerCase().matches("^[aeiou].*")) {
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);
            }
            sb.append("ma");
            for (int j=0; j<i+1; j++) sb.append("a");
            result.add(sb.toString());
        }
        return String.join(" ", result);
    }
}

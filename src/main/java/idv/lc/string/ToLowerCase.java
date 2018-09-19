package idv.lc.string;

import java.util.*;

public class ToLowerCase {
    public String toLowerCase(String str) {
        int diff = 'a' - 'A';
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c>='A' && c<='Z') {
                sb.append((char)(c + diff));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

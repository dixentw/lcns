package idv.lc.string;

import java.util.*;

public class ValidIPAddr {
    // ipv4簡單
    // ipv6就比較麻煩，規則比較多
    public String validIPAddress(String IP) {
        if(IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])")) return "IPv4";
        if(IP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})")) return "IPv6";
        return "Neither";

    }
}

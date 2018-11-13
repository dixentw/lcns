package idv.lc.math;

import java.util.*;

public class LC535 {
    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    String baseURL = "http://tinyurl.com/";
    Map<String, String> toShort = new HashMap<>();
    Map<String, String> toLong = new HashMap<>();
    Random rand = new Random();

    public String genURL () {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<6; i++) { //as spec in description
            int idx = Math.abs(rand.nextInt()) % chars.length();
            sb.append(chars.charAt(idx));
        }
        return sb.toString();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (toShort.containsKey(longUrl)) {
            return toShort.get(longUrl);
        }
        String ranchars = genURL();
        toShort.put(longUrl, baseURL+ranchars);
        toLong.put(baseURL+ranchars, longUrl);
        return baseURL+ranchars;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return toLong.get(shortUrl);
    }
}

package idv.lc.array;

import java.util.*;

class NumMatchSubSeq {
    public int numMatchingSubseq(String S, String[] words) {
        Map<Character, List<Integer>> table = new HashMap<>();
        for(int i=0; i<S.length(); i++){
            List<Integer> l = table.get(S.charAt(i));
            if(l==null){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                table.put(S.charAt(i), tmp);
            }else{
                l.add(i);
                table.put(S.charAt(i), l); // need this line ?
            }
        }
        int result = 0;
        for(String word : words) {
            int prev = -1;
            int w = 0;
            for(char c : word.toCharArray()) {
                List<Integer> l = table.get(c);
                if(l == null) {
                    break;
                } else {
                    for(Integer n : l){
                        if(n > prev) {
                            prev = n;
                            w++;
                            break;
                        }
                    }
                }
            }
            if(w==word.length()){
                result++;
            }
        }
        return result;
    }
}

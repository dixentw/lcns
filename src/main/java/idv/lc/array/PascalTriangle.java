package idv.lc.array;

import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) { //這裏j要以i為依歸，不是numOfRows
                if (j==0 || j==i) {
                    row.add(1);
                } else {
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }

    public List<List<Integer>> generateOld(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        for(int i=1; i<numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            List<Integer> prev = res.get(i-1);
            for(int j=1; j< prev.size(); j++){
                tmp.add(prev.get(j-1)+prev.get(j));
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res;
    }
}

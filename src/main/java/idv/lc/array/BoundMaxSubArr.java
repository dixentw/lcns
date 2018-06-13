package idv.lc.array;

import java.util.*;

class BoundMaxSubArr {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int totalSec = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] <= R) {
                int start = i;
                while(i<A.length && A[i] <= R) i++;
                System.out.println(totalSec);
                totalSec += (i-start+1)*(i-start)/2;
            }
        }
        System.out.println(totalSec);
        for(int i=0; i<A.length; i++){
            if(A[i] < L) {
                int start = i;
                while(i<A.length && A[i]<L) i++;
                totalSec -= (i-start+1)*(i-start)/2;
            }
        }
        return totalSec;
    }
    public int numSubarrayBoundedMax_BT(int[] A, int L, int R) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(res, tmp, A, 0, L, R);
        for(List<Integer> r : res) {
            System.out.println(Arrays.toString(r.toArray()));
        }
        return res.size();
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int[] A, int start, int L, int R) {
        int max = Integer.MIN_VALUE;
        for(Integer e : path){
            max = Math.max(max, e);
        }
        if(max >= L && max <= R){
            res.add(new ArrayList<Integer>(path));
        }
        for(int i=start; i<A.length; i++){
            if(A[i] > R) {
                break;
            }
            path.add(A[i]);
            helper(res, path, A, i+1, L, R);
            path.remove(path.size()-1);
        }
    }
}

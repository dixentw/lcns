package idv.lc.array;

import java.util.*;

class FriendRequests {
    /*
     * 1. Naive解就是雙重迴圈, TLE error
     * 2. 把ages 換成array, 這樣只要檢查 120個array element就好了
     * 3. 還可以把15以下踢掉, 因為14歲不會跟14/2+7 =14歲交朋友，所以往下都不會交朋友
     * 4. 只有15歲的會跟14歲交朋友
     * 5. 其實值域換成120 個就可以使用double loop了，這樣還比較簡單
     */

    public int numFriendRequests(int[] ages) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int a: ages) map.put(a, map.getOrDefault(a, 0)+1);
        int res = 0;
        for (Integer a : map.keySet()) {
            for (Integer b: map.keySet()) {
                if (!(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100))) {
                    if (a==b) {
                        res+= map.get(a) * map.get(b) - map.get(a);
                    } else {
                        res+= map.get(a) * map.get(b);
                    }
                }
            }
        }
        return res;
    }

    //naive
    public int numFriendRequests1(int[] ages) {
        int request = 0;
        for(int a=0; a<ages.length; a++){
            for(int b=0; b<ages.length; b++){
                if(a!=b){
                    if((ages[b] <= 0.5*ages[a]+7) || (ages[b] > ages[a]) || (ages[b]>100 && ages[a]<100)){
                        // do nothing
                    }else{
                        request++;
                    }
                }
            }
        }
        return request;
    }
    // for loop
    public int numFriendRequests2(int[] ages) {
        int request = 0;
        //since the age range is 1~120, count the number in age.
        int[] numsInAges = new int[121];
        for(int i : ages){
            numsInAges[i]++;
        }
        // A age people will make friend request to people in [A/2+7,A], so don't count anyone younger than 15
        // [14, 15], [14, 14]X, [13, 13]X, [13. 12]X.....
        for(int i=15; i<=120; i++){
            if(numsInAges[i]==0){
                continue;
            }
            int sum = 0;
            for(int j=i; j>(i/2+7); j--){
                //System.out.printf(">>>> %d, %d\n", j, numsInAges[j]);
                sum += numsInAges[j];
            }
            // [16, 16, 16] for same age, 3*3-3 is the correct request nubmer. every one make request to others and deduce from self.
            // the sum is calculate from same age, same age - 1, same age -2 .... same age/2+7
            request += sum * numsInAges[i] - numsInAges[i];
        }
        return request;
    }
}

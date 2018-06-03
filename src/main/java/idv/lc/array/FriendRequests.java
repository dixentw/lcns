package idv.lc.array;

import java.util.*;

class FriendRequests {
    public int numFriendRequests(int[] ages) {
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

package idv.lc.string;

import java.util.*;

class RobotGo {
    /*
     * judge if this robot and move to origin
     */
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char c : moves.toCharArray()){
            if(c == 'R') {
                x++;
            }else if(c == 'L') {
                x--;
            }else if(c == 'U') {
                y--;
            }else if(c == 'D') {
                y++;
            }else {
                return false;
            }
        }
        if(x!=0||y!=0){
            return false;
        }
        return true;
    }
}

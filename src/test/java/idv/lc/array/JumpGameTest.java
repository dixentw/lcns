package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class JumpGameTest {
    JumpGame s = new JumpGame();
    @Test
    public void test1(){
        assertTrue(s.canJump(new int[]{2,3,1,1,4}));
        assertFalse(s.canJump(new int[]{3,2,1,0,4}));
        assertFalse(s.canJump(new int[]{0,2,3}));
        assertTrue(s.canJump(new int[]{2,0,0}));
    }
}

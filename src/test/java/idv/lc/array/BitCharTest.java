package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BitCharTest {
    BitChar s = new BitChar();
    @Test
    public void test1(){
        assertTrue(s.isOneBitCharacter(new int[]{1,0,0}));
        assertFalse(s.isOneBitCharacter(new int[]{1,1,1,0}));
        assertTrue(s.isOneBitCharacter(new int[]{1,1,1,1,0}));
    }
}

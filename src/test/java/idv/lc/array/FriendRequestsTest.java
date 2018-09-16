package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FriendRequestsTest {
    FriendRequests s = new FriendRequests();
    @Test
    public void test1(){
        assertEquals(2, s.numFriendRequests(new int[]{16,16}));
        assertEquals(2, s.numFriendRequests(new int[]{16,17,18}));
        assertEquals(3, s.numFriendRequests(new int[]{20,30,100,110,120}));
    }
}

package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NumSpecialEquivGroupsTest {
    NumSpecialEquivGroups s = new NumSpecialEquivGroups();
    @Test
    public void test1(){
        assertEquals(3, s.numSpecialEquivGroups(
            new String[]{"abc","acb","bac","bca","cab","cba"}
        ));
    }
}

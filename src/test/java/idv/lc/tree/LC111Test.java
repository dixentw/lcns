package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC111Test {
    LC111 s = new LC111();
    LC536 p = new LC536();
    @Test
    public void test2(){
        String tr = "1(2)";
        TreeNode ro = p.str2tree(tr);
        assertEquals(2, s.minDepth(ro));

    }
    @Test
    public void test1(){
        String tr = "3(9)(20(15)(7))";
        TreeNode ro = p.str2tree(tr);
        assertEquals(2, s.minDepth(ro));

    }
}

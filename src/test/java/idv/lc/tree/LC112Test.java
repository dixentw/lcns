package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC112Test {
    LC112 s = new LC112();
    LC536 p = new LC536();
    @Test
    public void test1(){
        String tr = "5(4(11(7)(2)))(8(13)(4()(1)))";
        TreeNode ro = p.str2tree(tr);
        assertTrue(s.hasPathSum(ro, 22));
    }
    @Test
    public void test2(){
        String tr = "5(4)(6)";
        TreeNode ro = p.str2tree(tr);
        assertTrue(s.hasPathSum(ro, 9));
    }
    @Test
    public void test3(){
        String tr = "1(2)";
        TreeNode ro = p.str2tree(tr);
        assertFalse(s.hasPathSum(ro, 1));
    }
}

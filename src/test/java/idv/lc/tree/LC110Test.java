package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC110Test {
    LC110 s = new LC110();
    LC536 p = new LC536();
    @Test
    public void test1(){
        String tr = "3(9)(20(15)(7))";
        TreeNode ro = p.str2tree(tr);
        assertTrue(s.isBalanced(ro));
    }
    @Test
    public void test2(){
        String tr = "1(2(3(4)(4))(3))(2)";
        TreeNode ro = p.str2tree(tr);
        assertFalse(s.isBalanced(ro));
    }
    @Test
    public void test3(){
        String tr = "1(2(3(4)))(2(3(4)))";
        TreeNode ro = p.str2tree(tr);
        assertFalse(s.isBalanced(ro));
    }
}

package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseWords3Test {
    ReverseWords3 s = new ReverseWords3();
    @Test
    public void test1(){
        assertEquals(
        "s'teL ekat edoCteeL tsetnoc",
        s.reverseWords("Let's take LeetCode contest"));
    }
}

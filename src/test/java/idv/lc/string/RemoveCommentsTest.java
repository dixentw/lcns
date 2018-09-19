package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RemoveCommentsTest {
    RemoveComments s = new RemoveComments();
    @Test
    public void test1(){
        List<String> res = s.removeComments(new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"});
        String expect = "[int main(), { ,   , int a, b, c;, a = b + c;, }]";
        assertEquals(expect, Arrays.toString(res.toArray()));
    }
    @Test
    public void test2(){
        List<String> res = s.removeComments(new String[]{"a/*comment", "line", "more_comment*/b"});
        String expect = "[ab]";
        assertEquals(expect, Arrays.toString(res.toArray()));
    }
    @Test
    public void test3(){
        List<String> res = s.removeComments(new String[]{"a//*b//*c","blank","d//*e/*/f"});
        String expect = "[a, blank, d]";
        assertEquals(expect, Arrays.toString(res.toArray()));
    }
}

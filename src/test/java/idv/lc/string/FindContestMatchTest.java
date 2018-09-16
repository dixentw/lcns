package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindContestMatchTest {
    FindContestMatch s = new FindContestMatch();
    @Test
    public void test1(){
       assertEquals("(1,2)", s.findContestMatch(2));
       assertEquals("((1,4),(2,3))", s.findContestMatch(4));
       assertEquals("(((1,8),(4,5)),((2,7),(3,6)))", s.findContestMatch(8));
    }
}

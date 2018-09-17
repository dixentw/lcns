package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AddBoldTagTest {
    AddBoldTag s = new AddBoldTag();
    @Test
    public void test1(){
        assertEquals("<b>abc</b>xyz<b>123</b>", s.addBoldTag("abcxyz123", new String[]{"abc", "123"}));
        assertEquals("<b>aaabbc</b>c", s.addBoldTag("aaabbcc", new String[]{"aaa","aab","bc"}));
    }
}

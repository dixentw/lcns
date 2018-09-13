package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidWordAbbrTest {
    ValidWordAbbr s = new ValidWordAbbr();
    @Test
    public void test1(){
        assertTrue(s.validWordAbbreviation("internationalization", "i12iz4n"));
        assertFalse(s.validWordAbbreviation("apple", "a2e"));
        assertTrue(s.validWordAbbreviation("abbreviation", "a10n"));
    }
}

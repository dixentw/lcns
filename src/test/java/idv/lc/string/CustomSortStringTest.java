package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CustomSortStringTest {
    CustomSortString s = new CustomSortString();
    @Test
    public void test1(){
        assertEquals("cbad", s.customSortString("cba", "abcd"));
    }
}

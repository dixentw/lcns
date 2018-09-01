package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MyCalendarTest {
    MyCalendar s = new MyCalendar();
    @Test
    public void test1(){
        assertTrue(s.book(10, 20));
        assertFalse(s.book(15, 25));
        assertTrue(s.book(20, 30));
    }
}

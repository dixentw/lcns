package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MyCalendarTwoTest {
    @Test
    public void test1(){
        MyCalendarTwo s = new MyCalendarTwo();
        assertTrue(s.book(10, 20)); // returns true
        assertTrue(s.book(50, 60)); // returns true
        assertTrue(s.book(10, 40)); // returns true
        assertFalse(s.book(5, 15)); // returns false
        assertTrue(s.book(5, 10)); // returns true
        assertTrue(s.book(25, 55)); // returns true
    }
    @Test
    public void test1(){
        MyCalendarTwo s = new MyCalendarTwo();
        assertTrue(s.book(10, 20)); // returns true
        assertTrue(s.book(50, 60)); // returns true
        assertTrue(s.book(10, 40)); // returns true
        assertFalse(s.book(5, 15)); // returns false
        assertTrue(s.book(5, 10)); // returns true
        assertTrue(s.book(25, 55)); // returns true
    }
}

package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TaskSchedulerTest {
    TaskScheduler s = new TaskScheduler();
    @Test
    public void test1(){
        assertEquals(8, s.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}

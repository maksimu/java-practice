package threads;

import org.junit.Test;

import static org.junit.Assert.*;
import static threads.SimpleThreads.startThreads;

public class SimpleThreadsTest {

    @Test
    public void testStartThreads() throws Exception {

        startThreads(40);
    }
}
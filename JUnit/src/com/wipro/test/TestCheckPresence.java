package com.wipro.test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testPresenceTrue() {
        DailyTasks tasks = new DailyTasks();
        assertTrue(tasks.checkPresence("Hello World", "World"));
    }

    @Test
    public void testPresenceFalse() {
        DailyTasks tasks = new DailyTasks();
        assertFalse(tasks.checkPresence("Hello World", "Java"));
    }
}

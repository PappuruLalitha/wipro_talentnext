package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks tasks = new DailyTasks();

        int[] input = {5, 2, 8, 1};
        int[] expected = {1, 2, 5, 8};

        int[] result = tasks.sortValues(input);
        assertArrayEquals(expected, result);
    }
}

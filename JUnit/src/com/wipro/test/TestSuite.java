package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Tells JUnit to run this class as a suite
@RunWith(Suite.class)

// Add all your test classes here
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})

public class TestSuite {
    // No code needed here — this class only groups the tests
}

package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_383 {
    private final Production99_383 production = new Production99_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
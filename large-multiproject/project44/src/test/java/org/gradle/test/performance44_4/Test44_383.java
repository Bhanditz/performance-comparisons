package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_383 {
    private final Production44_383 production = new Production44_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
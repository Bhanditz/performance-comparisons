package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_50 {
    private final Production98_50 production = new Production98_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_319 {
    private final Production40_319 production = new Production40_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
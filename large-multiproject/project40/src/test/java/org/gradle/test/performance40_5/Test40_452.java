package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_452 {
    private final Production40_452 production = new Production40_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
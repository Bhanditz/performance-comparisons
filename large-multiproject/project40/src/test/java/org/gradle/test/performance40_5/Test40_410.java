package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_410 {
    private final Production40_410 production = new Production40_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
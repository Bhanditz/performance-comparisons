package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_94 {
    private final Production40_94 production = new Production40_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_69 {
    private final Production40_69 production = new Production40_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_8 {
    private final Production40_8 production = new Production40_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
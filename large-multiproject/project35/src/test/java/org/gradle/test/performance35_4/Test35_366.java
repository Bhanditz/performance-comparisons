package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_366 {
    private final Production35_366 production = new Production35_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
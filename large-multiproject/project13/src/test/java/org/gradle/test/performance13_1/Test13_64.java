package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_64 {
    private final Production13_64 production = new Production13_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
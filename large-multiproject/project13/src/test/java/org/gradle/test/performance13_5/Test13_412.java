package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_412 {
    private final Production13_412 production = new Production13_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_430 {
    private final Production25_430 production = new Production25_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
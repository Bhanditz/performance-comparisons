package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_335 {
    private final Production25_335 production = new Production25_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
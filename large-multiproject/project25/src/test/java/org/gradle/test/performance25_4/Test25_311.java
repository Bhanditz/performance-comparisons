package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_311 {
    private final Production25_311 production = new Production25_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_259 {
    private final Production25_259 production = new Production25_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
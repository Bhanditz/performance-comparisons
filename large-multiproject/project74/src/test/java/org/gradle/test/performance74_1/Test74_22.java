package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_22 {
    private final Production74_22 production = new Production74_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
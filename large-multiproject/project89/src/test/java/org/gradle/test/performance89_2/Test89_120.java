package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_120 {
    private final Production89_120 production = new Production89_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
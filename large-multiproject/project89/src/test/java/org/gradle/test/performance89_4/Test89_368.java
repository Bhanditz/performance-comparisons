package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_368 {
    private final Production89_368 production = new Production89_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
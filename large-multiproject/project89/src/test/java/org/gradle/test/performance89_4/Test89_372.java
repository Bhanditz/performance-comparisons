package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_372 {
    private final Production89_372 production = new Production89_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
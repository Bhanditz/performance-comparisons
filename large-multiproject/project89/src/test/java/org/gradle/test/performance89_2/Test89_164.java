package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_164 {
    private final Production89_164 production = new Production89_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
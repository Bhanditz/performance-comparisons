package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_193 {
    private final Production89_193 production = new Production89_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
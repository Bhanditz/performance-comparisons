package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_47 {
    private final Production89_47 production = new Production89_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
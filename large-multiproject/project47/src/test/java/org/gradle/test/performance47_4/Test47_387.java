package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_387 {
    private final Production47_387 production = new Production47_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
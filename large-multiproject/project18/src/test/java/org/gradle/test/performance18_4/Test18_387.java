package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_387 {
    private final Production18_387 production = new Production18_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_70 {
    private final Production80_70 production = new Production80_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
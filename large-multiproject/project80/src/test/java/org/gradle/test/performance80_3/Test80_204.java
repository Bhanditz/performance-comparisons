package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_204 {
    private final Production80_204 production = new Production80_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
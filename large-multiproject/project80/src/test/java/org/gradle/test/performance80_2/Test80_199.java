package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_199 {
    private final Production80_199 production = new Production80_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
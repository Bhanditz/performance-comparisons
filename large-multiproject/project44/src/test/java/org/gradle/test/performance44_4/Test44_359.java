package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_359 {
    private final Production44_359 production = new Production44_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
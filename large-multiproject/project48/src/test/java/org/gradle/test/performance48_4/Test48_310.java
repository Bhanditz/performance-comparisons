package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_310 {
    private final Production48_310 production = new Production48_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_315 {
    private final Production48_315 production = new Production48_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
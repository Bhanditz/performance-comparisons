package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_396 {
    private final Production20_396 production = new Production20_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
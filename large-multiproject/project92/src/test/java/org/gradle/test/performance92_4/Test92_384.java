package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_384 {
    private final Production92_384 production = new Production92_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_372 {
    private final Production18_372 production = new Production18_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
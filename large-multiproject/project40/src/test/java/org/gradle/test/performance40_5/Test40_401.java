package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_401 {
    private final Production40_401 production = new Production40_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
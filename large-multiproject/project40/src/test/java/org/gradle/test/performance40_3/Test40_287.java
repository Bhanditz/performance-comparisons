package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_287 {
    private final Production40_287 production = new Production40_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
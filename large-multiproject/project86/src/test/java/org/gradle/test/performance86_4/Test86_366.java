package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_366 {
    private final Production86_366 production = new Production86_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
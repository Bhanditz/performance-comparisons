package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9501 {
    private final Productionnull_9501 production = new Productionnull_9501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
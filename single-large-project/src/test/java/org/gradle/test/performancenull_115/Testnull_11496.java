package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11496 {
    private final Productionnull_11496 production = new Productionnull_11496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
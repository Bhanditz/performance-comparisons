package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37477 {
    private final Productionnull_37477 production = new Productionnull_37477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
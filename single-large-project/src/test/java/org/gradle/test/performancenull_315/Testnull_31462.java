package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31462 {
    private final Productionnull_31462 production = new Productionnull_31462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
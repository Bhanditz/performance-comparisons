package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17099 {
    private final Productionnull_17099 production = new Productionnull_17099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
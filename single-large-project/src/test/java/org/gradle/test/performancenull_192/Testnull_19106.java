package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19106 {
    private final Productionnull_19106 production = new Productionnull_19106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4705 {
    private final Productionnull_4705 production = new Productionnull_4705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
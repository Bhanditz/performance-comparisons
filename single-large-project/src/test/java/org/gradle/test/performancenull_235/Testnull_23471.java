package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23471 {
    private final Productionnull_23471 production = new Productionnull_23471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
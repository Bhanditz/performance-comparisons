package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36339 {
    private final Productionnull_36339 production = new Productionnull_36339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
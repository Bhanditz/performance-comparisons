package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36248 {
    private final Productionnull_36248 production = new Productionnull_36248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
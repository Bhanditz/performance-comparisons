package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40352 {
    private final Productionnull_40352 production = new Productionnull_40352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28431 {
    private final Productionnull_28431 production = new Productionnull_28431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
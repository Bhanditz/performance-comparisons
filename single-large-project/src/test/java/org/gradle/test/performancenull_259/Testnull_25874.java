package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25874 {
    private final Productionnull_25874 production = new Productionnull_25874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20648 {
    private final Productionnull_20648 production = new Productionnull_20648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
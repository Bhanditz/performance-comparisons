package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12964 {
    private final Productionnull_12964 production = new Productionnull_12964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
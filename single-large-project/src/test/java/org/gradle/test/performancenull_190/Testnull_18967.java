package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18967 {
    private final Productionnull_18967 production = new Productionnull_18967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
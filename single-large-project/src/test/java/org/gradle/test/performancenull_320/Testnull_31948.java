package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31948 {
    private final Productionnull_31948 production = new Productionnull_31948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
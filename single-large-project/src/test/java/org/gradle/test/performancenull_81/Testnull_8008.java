package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8008 {
    private final Productionnull_8008 production = new Productionnull_8008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
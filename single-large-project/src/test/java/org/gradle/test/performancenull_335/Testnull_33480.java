package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33480 {
    private final Productionnull_33480 production = new Productionnull_33480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
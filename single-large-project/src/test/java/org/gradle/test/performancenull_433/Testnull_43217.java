package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43217 {
    private final Productionnull_43217 production = new Productionnull_43217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
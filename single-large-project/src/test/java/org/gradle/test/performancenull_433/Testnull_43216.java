package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43216 {
    private final Productionnull_43216 production = new Productionnull_43216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2348 {
    private final Productionnull_2348 production = new Productionnull_2348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22283 {
    private final Productionnull_22283 production = new Productionnull_22283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
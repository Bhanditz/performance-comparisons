package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8026 {
    private final Productionnull_8026 production = new Productionnull_8026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
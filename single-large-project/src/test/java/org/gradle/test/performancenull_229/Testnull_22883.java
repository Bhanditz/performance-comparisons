package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22883 {
    private final Productionnull_22883 production = new Productionnull_22883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
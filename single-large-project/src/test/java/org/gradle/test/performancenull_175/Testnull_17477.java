package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17477 {
    private final Productionnull_17477 production = new Productionnull_17477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
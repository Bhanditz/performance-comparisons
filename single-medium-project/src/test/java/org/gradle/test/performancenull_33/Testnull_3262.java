package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3262 {
    private final Productionnull_3262 production = new Productionnull_3262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
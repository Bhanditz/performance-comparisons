package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35820 {
    private final Productionnull_35820 production = new Productionnull_35820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
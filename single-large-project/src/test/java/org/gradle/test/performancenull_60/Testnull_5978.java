package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5978 {
    private final Productionnull_5978 production = new Productionnull_5978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
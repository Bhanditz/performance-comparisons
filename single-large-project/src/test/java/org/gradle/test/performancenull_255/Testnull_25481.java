package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25481 {
    private final Productionnull_25481 production = new Productionnull_25481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23415 {
    private final Productionnull_23415 production = new Productionnull_23415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
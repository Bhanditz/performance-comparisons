package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32935 {
    private final Productionnull_32935 production = new Productionnull_32935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
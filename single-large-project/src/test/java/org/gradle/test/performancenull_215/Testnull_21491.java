package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21491 {
    private final Productionnull_21491 production = new Productionnull_21491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
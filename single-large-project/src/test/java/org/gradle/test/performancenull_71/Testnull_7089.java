package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7089 {
    private final Productionnull_7089 production = new Productionnull_7089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
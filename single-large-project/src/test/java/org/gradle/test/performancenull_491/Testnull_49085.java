package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49085 {
    private final Productionnull_49085 production = new Productionnull_49085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
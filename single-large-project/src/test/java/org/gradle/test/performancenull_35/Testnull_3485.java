package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3485 {
    private final Productionnull_3485 production = new Productionnull_3485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22966 {
    private final Productionnull_22966 production = new Productionnull_22966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
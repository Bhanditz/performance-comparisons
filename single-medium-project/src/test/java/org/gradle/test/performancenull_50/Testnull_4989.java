package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4989 {
    private final Productionnull_4989 production = new Productionnull_4989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9518 {
    private final Productionnull_9518 production = new Productionnull_9518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
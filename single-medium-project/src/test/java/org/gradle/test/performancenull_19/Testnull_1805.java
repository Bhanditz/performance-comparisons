package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1805 {
    private final Productionnull_1805 production = new Productionnull_1805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
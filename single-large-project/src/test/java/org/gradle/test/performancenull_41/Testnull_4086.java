package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4086 {
    private final Productionnull_4086 production = new Productionnull_4086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
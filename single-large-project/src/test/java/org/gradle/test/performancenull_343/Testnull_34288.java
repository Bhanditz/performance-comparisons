package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34288 {
    private final Productionnull_34288 production = new Productionnull_34288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
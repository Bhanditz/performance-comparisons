package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42789 {
    private final Productionnull_42789 production = new Productionnull_42789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
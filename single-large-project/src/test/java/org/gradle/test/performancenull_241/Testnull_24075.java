package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24075 {
    private final Productionnull_24075 production = new Productionnull_24075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
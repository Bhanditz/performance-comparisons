package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24601 {
    private final Productionnull_24601 production = new Productionnull_24601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
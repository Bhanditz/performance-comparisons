package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18806 {
    private final Productionnull_18806 production = new Productionnull_18806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
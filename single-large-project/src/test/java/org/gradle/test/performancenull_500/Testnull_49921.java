package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49921 {
    private final Productionnull_49921 production = new Productionnull_49921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
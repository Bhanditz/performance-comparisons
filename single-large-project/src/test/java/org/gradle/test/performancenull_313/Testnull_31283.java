package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31283 {
    private final Productionnull_31283 production = new Productionnull_31283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21885 {
    private final Productionnull_21885 production = new Productionnull_21885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
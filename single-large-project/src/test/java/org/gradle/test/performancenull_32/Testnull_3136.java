package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3136 {
    private final Productionnull_3136 production = new Productionnull_3136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
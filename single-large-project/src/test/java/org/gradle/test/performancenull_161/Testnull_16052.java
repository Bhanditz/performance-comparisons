package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16052 {
    private final Productionnull_16052 production = new Productionnull_16052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
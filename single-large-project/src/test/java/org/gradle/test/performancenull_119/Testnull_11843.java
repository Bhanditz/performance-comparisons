package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11843 {
    private final Productionnull_11843 production = new Productionnull_11843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
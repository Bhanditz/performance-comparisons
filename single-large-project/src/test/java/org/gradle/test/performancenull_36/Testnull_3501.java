package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3501 {
    private final Productionnull_3501 production = new Productionnull_3501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
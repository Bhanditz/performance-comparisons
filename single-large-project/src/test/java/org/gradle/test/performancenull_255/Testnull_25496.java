package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25496 {
    private final Productionnull_25496 production = new Productionnull_25496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
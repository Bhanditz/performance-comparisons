package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40678 {
    private final Productionnull_40678 production = new Productionnull_40678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
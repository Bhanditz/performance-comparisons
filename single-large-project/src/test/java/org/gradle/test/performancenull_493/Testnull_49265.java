package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49265 {
    private final Productionnull_49265 production = new Productionnull_49265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
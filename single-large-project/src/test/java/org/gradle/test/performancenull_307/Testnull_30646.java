package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30646 {
    private final Productionnull_30646 production = new Productionnull_30646("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
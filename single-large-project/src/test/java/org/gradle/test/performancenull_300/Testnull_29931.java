package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29931 {
    private final Productionnull_29931 production = new Productionnull_29931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
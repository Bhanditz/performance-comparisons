package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6378 {
    private final Productionnull_6378 production = new Productionnull_6378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36303 {
    private final Productionnull_36303 production = new Productionnull_36303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
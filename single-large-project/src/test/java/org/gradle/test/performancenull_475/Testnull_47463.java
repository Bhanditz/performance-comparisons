package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47463 {
    private final Productionnull_47463 production = new Productionnull_47463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
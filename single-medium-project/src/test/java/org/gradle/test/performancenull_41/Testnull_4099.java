package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4099 {
    private final Productionnull_4099 production = new Productionnull_4099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19944 {
    private final Productionnull_19944 production = new Productionnull_19944("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
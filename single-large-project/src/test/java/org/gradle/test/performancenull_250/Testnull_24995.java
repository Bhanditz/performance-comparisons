package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24995 {
    private final Productionnull_24995 production = new Productionnull_24995("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
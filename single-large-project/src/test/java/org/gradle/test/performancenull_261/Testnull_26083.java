package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26083 {
    private final Productionnull_26083 production = new Productionnull_26083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
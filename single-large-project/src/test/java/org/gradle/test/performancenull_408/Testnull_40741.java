package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40741 {
    private final Productionnull_40741 production = new Productionnull_40741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3951 {
    private final Productionnull_3951 production = new Productionnull_3951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
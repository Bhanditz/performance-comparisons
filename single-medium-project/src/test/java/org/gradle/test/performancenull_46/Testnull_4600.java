package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4600 {
    private final Productionnull_4600 production = new Productionnull_4600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1742 {
    private final Productionnull_1742 production = new Productionnull_1742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
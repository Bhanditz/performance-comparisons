package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38529 {
    private final Productionnull_38529 production = new Productionnull_38529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14969 {
    private final Productionnull_14969 production = new Productionnull_14969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
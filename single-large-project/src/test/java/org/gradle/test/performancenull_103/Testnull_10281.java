package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10281 {
    private final Productionnull_10281 production = new Productionnull_10281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
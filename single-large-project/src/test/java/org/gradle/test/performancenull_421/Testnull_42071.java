package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42071 {
    private final Productionnull_42071 production = new Productionnull_42071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43016 {
    private final Productionnull_43016 production = new Productionnull_43016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
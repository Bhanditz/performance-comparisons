package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27496 {
    private final Productionnull_27496 production = new Productionnull_27496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27099 {
    private final Productionnull_27099 production = new Productionnull_27099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
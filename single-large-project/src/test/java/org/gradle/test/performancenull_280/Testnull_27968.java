package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27968 {
    private final Productionnull_27968 production = new Productionnull_27968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
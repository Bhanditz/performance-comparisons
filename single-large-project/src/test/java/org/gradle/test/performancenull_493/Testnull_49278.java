package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49278 {
    private final Productionnull_49278 production = new Productionnull_49278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
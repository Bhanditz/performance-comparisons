package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37963 {
    private final Productionnull_37963 production = new Productionnull_37963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
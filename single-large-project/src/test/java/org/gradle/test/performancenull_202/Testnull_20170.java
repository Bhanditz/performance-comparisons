package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20170 {
    private final Productionnull_20170 production = new Productionnull_20170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
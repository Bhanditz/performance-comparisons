package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20140 {
    private final Productionnull_20140 production = new Productionnull_20140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
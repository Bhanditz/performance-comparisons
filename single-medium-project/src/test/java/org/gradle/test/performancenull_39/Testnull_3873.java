package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3873 {
    private final Productionnull_3873 production = new Productionnull_3873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
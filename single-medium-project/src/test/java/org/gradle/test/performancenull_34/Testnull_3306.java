package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3306 {
    private final Productionnull_3306 production = new Productionnull_3306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
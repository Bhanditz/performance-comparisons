package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30087 {
    private final Productionnull_30087 production = new Productionnull_30087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
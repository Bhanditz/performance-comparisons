package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43783 {
    private final Productionnull_43783 production = new Productionnull_43783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_478 {
    private final Production27_478 production = new Production27_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_456 {
    private final Production54_456 production = new Production54_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
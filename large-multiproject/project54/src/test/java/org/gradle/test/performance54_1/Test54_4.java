package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_4 {
    private final Production54_4 production = new Production54_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
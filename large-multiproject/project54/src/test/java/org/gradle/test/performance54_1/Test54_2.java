package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_2 {
    private final Production54_2 production = new Production54_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
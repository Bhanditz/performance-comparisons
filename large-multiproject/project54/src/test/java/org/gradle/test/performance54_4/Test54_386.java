package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_386 {
    private final Production54_386 production = new Production54_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
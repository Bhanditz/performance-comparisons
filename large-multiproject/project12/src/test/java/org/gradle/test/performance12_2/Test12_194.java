package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_194 {
    private final Production12_194 production = new Production12_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_32 {
    private final Production93_32 production = new Production93_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
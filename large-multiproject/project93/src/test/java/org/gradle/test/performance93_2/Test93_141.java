package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_141 {
    private final Production93_141 production = new Production93_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
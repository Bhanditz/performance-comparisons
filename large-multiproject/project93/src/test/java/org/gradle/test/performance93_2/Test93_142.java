package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_142 {
    private final Production93_142 production = new Production93_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
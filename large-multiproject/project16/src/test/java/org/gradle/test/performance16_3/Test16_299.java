package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_299 {
    private final Production16_299 production = new Production16_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
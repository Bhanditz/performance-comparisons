package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_176 {
    private final Production16_176 production = new Production16_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
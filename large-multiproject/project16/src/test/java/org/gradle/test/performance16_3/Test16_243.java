package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_243 {
    private final Production16_243 production = new Production16_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
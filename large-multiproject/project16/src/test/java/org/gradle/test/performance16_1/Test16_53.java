package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_53 {
    private final Production16_53 production = new Production16_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_61 {
    private final Production16_61 production = new Production16_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
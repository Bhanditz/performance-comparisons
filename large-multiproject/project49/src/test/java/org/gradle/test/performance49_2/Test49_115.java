package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_115 {
    private final Production49_115 production = new Production49_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}